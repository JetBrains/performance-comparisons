package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_90 {
    private final Production17_90 production = new Production17_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}