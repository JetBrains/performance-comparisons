package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_341 {
    private final Production56_341 production = new Production56_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}