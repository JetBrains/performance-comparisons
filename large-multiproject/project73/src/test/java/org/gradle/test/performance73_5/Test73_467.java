package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_467 {
    private final Production73_467 production = new Production73_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}