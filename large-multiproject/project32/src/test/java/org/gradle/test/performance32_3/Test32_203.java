package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_203 {
    private final Production32_203 production = new Production32_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}