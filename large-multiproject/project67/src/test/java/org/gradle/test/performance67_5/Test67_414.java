package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_414 {
    private final Production67_414 production = new Production67_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}