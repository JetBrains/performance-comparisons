package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_122 {
    private final Production43_122 production = new Production43_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}