package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_370 {
    private final Production57_370 production = new Production57_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}