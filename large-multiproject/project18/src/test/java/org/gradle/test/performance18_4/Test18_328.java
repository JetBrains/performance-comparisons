package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_328 {
    private final Production18_328 production = new Production18_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}