package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_133 {
    private final Production71_133 production = new Production71_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}