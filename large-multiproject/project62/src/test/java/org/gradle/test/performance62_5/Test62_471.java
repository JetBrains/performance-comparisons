package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_471 {
    private final Production62_471 production = new Production62_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}