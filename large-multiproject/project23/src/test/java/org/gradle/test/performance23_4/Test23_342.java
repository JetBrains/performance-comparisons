package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_342 {
    private final Production23_342 production = new Production23_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}