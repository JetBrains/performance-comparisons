package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_34 {
    private final Production17_34 production = new Production17_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}