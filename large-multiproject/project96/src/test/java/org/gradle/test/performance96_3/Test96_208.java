package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_208 {
    private final Production96_208 production = new Production96_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}