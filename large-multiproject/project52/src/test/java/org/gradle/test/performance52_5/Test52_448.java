package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_448 {
    private final Production52_448 production = new Production52_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}