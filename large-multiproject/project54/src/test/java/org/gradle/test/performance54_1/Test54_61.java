package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_61 {
    private final Production54_61 production = new Production54_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}