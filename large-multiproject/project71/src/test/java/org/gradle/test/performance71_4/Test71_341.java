package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_341 {
    private final Production71_341 production = new Production71_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}