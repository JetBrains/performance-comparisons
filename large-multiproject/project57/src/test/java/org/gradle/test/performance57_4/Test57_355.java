package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_355 {
    private final Production57_355 production = new Production57_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}