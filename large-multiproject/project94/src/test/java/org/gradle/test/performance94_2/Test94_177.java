package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_177 {
    private final Production94_177 production = new Production94_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}