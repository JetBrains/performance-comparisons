package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_266 {
    private final Production56_266 production = new Production56_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}