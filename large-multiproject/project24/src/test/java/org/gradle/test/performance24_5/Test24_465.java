package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_465 {
    private final Production24_465 production = new Production24_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}