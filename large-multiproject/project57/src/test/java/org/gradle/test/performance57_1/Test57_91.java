package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_91 {
    private final Production57_91 production = new Production57_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}