package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_119 {
    private final Production20_119 production = new Production20_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}