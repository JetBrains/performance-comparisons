package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_394 {
    private final Production34_394 production = new Production34_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}