package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_365 {
    private final Production76_365 production = new Production76_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}