package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_348 {
    private final Production97_348 production = new Production97_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}