package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_141 {
    private final Production24_141 production = new Production24_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}