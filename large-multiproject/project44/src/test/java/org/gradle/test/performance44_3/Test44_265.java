package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_265 {
    private final Production44_265 production = new Production44_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}