package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_373 {
    private final Production97_373 production = new Production97_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}