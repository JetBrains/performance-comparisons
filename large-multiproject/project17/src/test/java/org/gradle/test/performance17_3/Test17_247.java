package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_247 {
    private final Production17_247 production = new Production17_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}