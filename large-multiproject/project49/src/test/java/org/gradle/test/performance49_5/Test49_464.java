package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_464 {
    private final Production49_464 production = new Production49_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}