package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_442 {
    private final Production98_442 production = new Production98_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}