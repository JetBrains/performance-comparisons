package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_268 {
    private final Production47_268 production = new Production47_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}