package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_153 {
    private final Production29_153 production = new Production29_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}