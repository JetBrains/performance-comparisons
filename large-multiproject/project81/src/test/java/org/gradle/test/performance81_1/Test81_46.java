package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_46 {
    private final Production81_46 production = new Production81_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}