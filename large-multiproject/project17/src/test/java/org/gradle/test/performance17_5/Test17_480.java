package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_480 {
    private final Production17_480 production = new Production17_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}