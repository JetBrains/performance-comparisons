package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_192 {
    private final Production26_192 production = new Production26_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}