package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_55 {
    private final Production49_55 production = new Production49_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}