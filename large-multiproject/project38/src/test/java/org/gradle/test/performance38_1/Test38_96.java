package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_96 {
    private final Production38_96 production = new Production38_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}