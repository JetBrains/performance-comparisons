package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_326 {
    private final Production13_326 production = new Production13_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}