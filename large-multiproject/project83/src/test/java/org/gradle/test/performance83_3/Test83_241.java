package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_241 {
    private final Production83_241 production = new Production83_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}