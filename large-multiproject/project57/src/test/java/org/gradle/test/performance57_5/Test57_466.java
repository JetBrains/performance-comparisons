package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_466 {
    private final Production57_466 production = new Production57_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}