package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_119 {
    private final Production35_119 production = new Production35_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}