package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_481 {
    private final Production86_481 production = new Production86_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}