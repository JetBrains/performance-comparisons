package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_156 {
    private final Production44_156 production = new Production44_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}