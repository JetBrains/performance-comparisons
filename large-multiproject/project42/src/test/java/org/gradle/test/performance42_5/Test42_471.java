package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_471 {
    private final Production42_471 production = new Production42_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}