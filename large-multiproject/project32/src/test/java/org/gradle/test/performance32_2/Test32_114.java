package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_114 {
    private final Production32_114 production = new Production32_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}