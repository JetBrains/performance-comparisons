package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_318 {
    private final Production60_318 production = new Production60_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}