package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_70 {
    private final Production67_70 production = new Production67_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}