package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_349 {
    private final Production11_349 production = new Production11_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}