package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_382 {
    private final Production97_382 production = new Production97_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}