package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_326 {
    private final Production76_326 production = new Production76_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}