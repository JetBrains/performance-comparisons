package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_24 {
    private final Production45_24 production = new Production45_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}