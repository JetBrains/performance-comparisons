package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_241 {
    private final Production42_241 production = new Production42_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}