package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_467 {
    private final Production15_467 production = new Production15_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}