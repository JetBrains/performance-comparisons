package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_268 {
    private final Production57_268 production = new Production57_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}