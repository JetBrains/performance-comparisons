package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_287 {
    private final Production57_287 production = new Production57_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}