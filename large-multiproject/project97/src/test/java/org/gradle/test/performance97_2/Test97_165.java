package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_165 {
    private final Production97_165 production = new Production97_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}