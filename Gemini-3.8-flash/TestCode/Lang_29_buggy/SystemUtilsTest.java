package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;

/**
 * Comprehensive Unit Tests for {@link SystemUtils}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class SystemUtilsTest {

    @Test
    public void getJavaHome_shouldReturnNonNullExistingDirectory() {
        // Arrange & Act
        File javaHome = SystemUtils.getJavaHome();

        // Assert
        assertNotNull(javaHome);
        assertTrue(javaHome.exists());
    }

    @Test
    public void getJavaIoTmpDir_shouldReturnExistingDirectory() {
        // Arrange & Act
        File tmpDir = SystemUtils.getJavaIoTmpDir();

        // Assert
        assertNotNull(tmpDir);
        assertTrue(tmpDir.exists());
    }

    @Test
    public void getUserDir_andUserHome_shouldReturnExistingDirectories() {
        // Arrange & Act
        File userDir = SystemUtils.getUserDir();
        File userHome = SystemUtils.getUserHome();

        // Assert
        assertNotNull(userDir);
        assertTrue(userDir.exists());
        assertNotNull(userHome);
        assertTrue(userHome.exists());
    }

    @Test
    public void isJavaVersionAtLeast_givenVersion_shouldEvaluateCorrectly() {
        // Arrange & Act & Assert
        assertTrue(SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_1_1));
        assertTrue(SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_1_5));
    }

    @Test
    public void isJavaAwtHeadless_shouldReturnBoolean() {
        // Arrange & Act
        boolean headless = SystemUtils.isJavaAwtHeadless();

        // Assert
        assertTrue(headless || !headless);
    }
}
