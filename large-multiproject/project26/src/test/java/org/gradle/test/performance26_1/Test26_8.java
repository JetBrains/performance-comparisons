package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_8 {
    private final Production26_8 production = new Production26_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}