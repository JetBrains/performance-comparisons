package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_240 {
    private final Production57_240 production = new Production57_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}