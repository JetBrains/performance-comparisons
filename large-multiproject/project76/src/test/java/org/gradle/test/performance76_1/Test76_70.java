package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_70 {
    private final Production76_70 production = new Production76_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}