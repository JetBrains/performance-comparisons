package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_108 {
    private final Production46_108 production = new Production46_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}