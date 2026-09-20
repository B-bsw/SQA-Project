package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Writer;

import org.junit.Test;

public class CharSequenceTranslatorTest {

    // Pass-through translator: consumes 0 codepoints, letting the