package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_447 {
    private final Production26_447 production = new Production26_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}