package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_215 {
    private final Production70_215 production = new Production70_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}