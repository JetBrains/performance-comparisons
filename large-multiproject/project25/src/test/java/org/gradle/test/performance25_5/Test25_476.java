package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_476 {
    private final Production25_476 production = new Production25_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}