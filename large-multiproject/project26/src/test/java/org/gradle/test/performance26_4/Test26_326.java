package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_326 {
    private final Production26_326 production = new Production26_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}