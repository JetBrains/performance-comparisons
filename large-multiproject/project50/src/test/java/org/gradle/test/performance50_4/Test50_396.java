package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_396 {
    private final Production50_396 production = new Production50_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}