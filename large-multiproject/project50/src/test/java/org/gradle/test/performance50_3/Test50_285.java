package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_285 {
    private final Production50_285 production = new Production50_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}