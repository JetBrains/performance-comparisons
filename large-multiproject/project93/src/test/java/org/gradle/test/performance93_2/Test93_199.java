package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_199 {
    private final Production93_199 production = new Production93_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}