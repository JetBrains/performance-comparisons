package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_331 {
    private final Production3_331 production = new Production3_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}