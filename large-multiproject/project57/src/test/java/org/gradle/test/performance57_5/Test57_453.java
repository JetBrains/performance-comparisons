package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_453 {
    private final Production57_453 production = new Production57_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}