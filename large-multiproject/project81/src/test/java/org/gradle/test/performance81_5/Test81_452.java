package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_452 {
    private final Production81_452 production = new Production81_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}