package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_483 {
    private final Production66_483 production = new Production66_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}