package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_256 {
    private final Production76_256 production = new Production76_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}