package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_352 {
    private final Production29_352 production = new Production29_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}