package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_339 {
    private final Production24_339 production = new Production24_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}