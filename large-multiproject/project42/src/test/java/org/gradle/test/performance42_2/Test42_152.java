package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_152 {
    private final Production42_152 production = new Production42_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}