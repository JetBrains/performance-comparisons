package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_200 {
    private final Production71_200 production = new Production71_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}