package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_488 {
    private final Production79_488 production = new Production79_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}