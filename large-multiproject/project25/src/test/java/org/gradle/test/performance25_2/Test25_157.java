package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_157 {
    private final Production25_157 production = new Production25_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}