package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_338 {
    private final Production54_338 production = new Production54_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}