package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_318 {
    private final Production97_318 production = new Production97_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}