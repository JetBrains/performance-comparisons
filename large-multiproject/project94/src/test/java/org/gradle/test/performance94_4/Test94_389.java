package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_389 {
    private final Production94_389 production = new Production94_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}