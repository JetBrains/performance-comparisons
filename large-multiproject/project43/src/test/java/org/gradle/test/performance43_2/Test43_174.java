package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_174 {
    private final Production43_174 production = new Production43_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}