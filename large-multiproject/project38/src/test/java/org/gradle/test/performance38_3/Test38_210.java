package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_210 {
    private final Production38_210 production = new Production38_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}