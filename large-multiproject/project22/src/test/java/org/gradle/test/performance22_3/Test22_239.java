package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_239 {
    private final Production22_239 production = new Production22_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}