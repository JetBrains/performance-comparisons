package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_422 {
    private final Production97_422 production = new Production97_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}