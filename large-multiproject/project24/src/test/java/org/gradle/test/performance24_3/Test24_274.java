package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_274 {
    private final Production24_274 production = new Production24_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}