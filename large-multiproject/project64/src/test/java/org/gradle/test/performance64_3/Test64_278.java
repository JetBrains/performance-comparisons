package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_278 {
    private final Production64_278 production = new Production64_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}