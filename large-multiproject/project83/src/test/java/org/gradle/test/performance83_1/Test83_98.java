package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_98 {
    private final Production83_98 production = new Production83_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}