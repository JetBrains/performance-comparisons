package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_431 {
    private final Production36_431 production = new Production36_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}