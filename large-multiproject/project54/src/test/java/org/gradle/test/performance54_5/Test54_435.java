package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_435 {
    private final Production54_435 production = new Production54_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}