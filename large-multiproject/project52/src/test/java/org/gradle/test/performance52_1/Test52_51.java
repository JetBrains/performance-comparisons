package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_51 {
    private final Production52_51 production = new Production52_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}