package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_76 {
    private final Production38_76 production = new Production38_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}