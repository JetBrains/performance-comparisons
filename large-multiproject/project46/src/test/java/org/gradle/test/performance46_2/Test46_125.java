package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_125 {
    private final Production46_125 production = new Production46_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}