package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_468 {
    private final Production62_468 production = new Production62_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}