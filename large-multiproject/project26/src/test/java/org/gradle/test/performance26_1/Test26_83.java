package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_83 {
    private final Production26_83 production = new Production26_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}