package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_181 {
    private final Production61_181 production = new Production61_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}