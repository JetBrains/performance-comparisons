package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_313 {
    private final Production11_313 production = new Production11_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}