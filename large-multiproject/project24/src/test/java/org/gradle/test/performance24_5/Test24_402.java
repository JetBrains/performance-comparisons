package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_402 {
    private final Production24_402 production = new Production24_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}