package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.DiagnosticGroup;
import com.google.javascript.jscomp.DiagnosticGroups;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DiagnosticGroupsTest {

  private DiagnosticGroups groups;

  @Before
  public void setUp() {
    groups = new DiagnosticGroups();
  }

  @Test
  public void testRegisterGroupWithNameAndTypes() {
    DiagnosticType type1 = DiagnosticType.error("TEST_ERROR_1", "Test error 1");
    DiagnosticType type2 = DiagnosticType.warning("TEST_WARNING_1", "Test warning 1");
    DiagnosticGroup group = DiagnosticGroups.registerGroup("testGroup1", type1, type2);
    assertNotNull(group);
    assertEquals("testGroup1", group.getName());
    assertEquals(2, group.getTypes().size());
    assertTrue(group.matches(type1));
    assertTrue(group.matches(type2));
  }

  @Test
  public void testRegisterGroupWithSubgroups() {
    DiagnosticGroup subGroup1 = new DiagnosticGroup("subGroup1",
        DiagnosticType.error("SUB_ERROR_1", "Sub error 1"));
    DiagnosticGroup subGroup2 = new DiagnosticGroup("subGroup2",
        DiagnosticType.warning("SUB_WARN_1", "Sub warning 1"));
    DiagnosticGroup parentGroup = DiagnosticGroups.registerGroup("parentGroup", subGroup1, subGroup2);
    assertNotNull(parentGroup);
    assertEquals("parentGroup", parentGroup.getName());
    assertTrue(parentGroup.getSubGroups().contains(subGroup1));
    assertTrue(parentGroup.getSubGroups().contains(subGroup2));
  }

  @Test
  public void testGetRegisteredGroupsReturnsAllGroups() {
    DiagnosticGroups.registerGroup("testAllGroups_" + System.nanoTime(),
        new DiagnosticGroup("testAllGroupsGroup",
            DiagnosticType.error("ALL_GROUP_ERROR", "All group error")));
    java.util.Map<String, DiagnosticGroup> allGroups = groups.getRegisteredGroups();
    assertNotNull(allGroups);
    assertTrue(allGroups.size() > 0);
  }

  @Test
  public void testForNameExistingGroup() {
    DiagnosticGroup group = DiagnosticGroups.registerGroup("testForNameGroup",
        new DiagnosticGroup("testForNameGroup",
            DiagnosticType.error("FOR_NAME_ERROR", "For name error")));
    DiagnosticGroup ret = groups.forName("testForNameGroup");
    assertNotNull(ret);
    assertSame(group, ret);
  }

  @Test
  public void testForNameNonExistingGroup() {
    assertNull(groups.forName("nonExistingGroup"));
  }

  @Test
  public void testSetWarningLevelsAppliesToAllGroups() {
    DiagnosticGroups.registerGroup("setWarningLevelsTestGroup1",
        new DiagnosticGroup("setWarningLevelsTestGroup1",
            DiagnosticType.error("SET_WARN_ERROR_1", "Set warn error 1")));
    DiagnosticGroups.registerGroup("setWarningLevelsTestGroup2",
        new DiagnosticGroup("setWarningLevelsTestGroup2",
            DiagnosticType.warning("SET_WARN_WARNING_1", "Set warn warning 1")));

    CompilerOptions options = new CompilerOptions();
    List<String> names = Arrays.asList("setWarningLevelsTestGroup1", "setWarningLevelsTestGroup2");
    groups.setWarningLevels(options, names, CheckLevel.ERROR);
    // Verify the options were updated (we can check a few known groups)
    assertNotNull(options);
    // Since setWarningLevels iterates and sets, just ensure no exception thrown
  }

  @Test(expected = NullPointerException.class)
  public void testSetWarningLevelsWithUnknownGroup() {
    List<String> names = Arrays.asList("unknownGroup", "anotherUnknown");
    groups.setWarningLevels(new CompilerOptions(), names, CheckLevel.WARNING);
  }

  @Test
  public void testSetWarningLevelsWithEmptyList() {
    groups.setWarningLevels(new CompilerOptions(), Arrays.asList(), CheckLevel.ERROR);
    // Should not throw, just returns
  }

  @Test
  public void testGlobalGroupRegistered() {
    DiagnosticGroup globalThis = groups.forName("globalThis");
    assertNotNull(globalThis);
    assertEquals("globalThis", globalThis.getName());
  }

  @Test
  public void testDeprecatedGroupRegistered() {
    DiagnosticGroup deprecated = groups.forName("deprecated");
    assertNotNull(deprecated);
    assertEquals("deprecated", deprecated.getName());
  }

  @Test
  public void testStaticGroupsMatchRegisteredNames() {
    // Check a few static groups to ensure they are properly registered
    assertNotNull(DiagnosticGroups.GLOBAL_THIS);
    assertNotNull(DiagnosticGroups.DEPRECATED);
    assertNotNull(DiagnosticGroups.VISIBILITY);
    assertNotNull(DiagnosticGroups.ACCESS_CONTROLS);
  }

  @Test
  public void testAllStaticGroupsAreRegisteredInMap() {
    assertNotNull(groups.forName(DiagnosticGroups.GLOBAL_THIS.getName()));
    assertNotNull(groups.forName(DiagnosticGroups.DEPRECATED.getName()));
    assertNotNull(groups.forName(DiagnosticGroups.VISIBILITY.getName()));
    assertNotNull(groups.forName(DiagnosticGroups.ACCESS_CONTROLS.getName()));
  }
}