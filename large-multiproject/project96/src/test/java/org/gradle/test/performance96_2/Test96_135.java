package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_135 {
    private final Production96_135 production = new Production96_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}