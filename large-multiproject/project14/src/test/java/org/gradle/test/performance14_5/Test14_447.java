package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_447 {
    private final Production14_447 production = new Production14_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}