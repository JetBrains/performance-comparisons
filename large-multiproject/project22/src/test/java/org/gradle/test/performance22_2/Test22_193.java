package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_193 {
    private final Production22_193 production = new Production22_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}