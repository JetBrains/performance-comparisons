package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_100 {
    private final Production46_100 production = new Production46_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}