package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_442 {
    private final Production11_442 production = new Production11_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}