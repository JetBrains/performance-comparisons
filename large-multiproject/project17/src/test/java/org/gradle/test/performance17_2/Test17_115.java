package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_115 {
    private final Production17_115 production = new Production17_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}