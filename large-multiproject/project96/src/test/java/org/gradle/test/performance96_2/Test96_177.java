package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_177 {
    private final Production96_177 production = new Production96_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}