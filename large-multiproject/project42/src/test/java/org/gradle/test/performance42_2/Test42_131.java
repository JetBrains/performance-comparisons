package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_131 {
    private final Production42_131 production = new Production42_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}