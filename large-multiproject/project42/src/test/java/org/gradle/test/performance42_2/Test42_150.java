package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_150 {
    private final Production42_150 production = new Production42_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}