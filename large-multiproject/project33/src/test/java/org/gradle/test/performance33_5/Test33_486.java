package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_486 {
    private final Production33_486 production = new Production33_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}