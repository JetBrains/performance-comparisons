package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_166 {
    private final Production44_166 production = new Production44_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}