package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_444 {
    private final Production61_444 production = new Production61_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}