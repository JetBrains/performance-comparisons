package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_212 {
    private final Production26_212 production = new Production26_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}