package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_215 {
    private final Production86_215 production = new Production86_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}