package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_169 {
    private final Production42_169 production = new Production42_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}