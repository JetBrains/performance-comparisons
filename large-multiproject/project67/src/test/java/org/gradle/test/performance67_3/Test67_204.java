package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_204 {
    private final Production67_204 production = new Production67_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}