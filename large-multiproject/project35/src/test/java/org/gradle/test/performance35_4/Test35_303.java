package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_303 {
    private final Production35_303 production = new Production35_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}