package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_234 {
    private final Production16_234 production = new Production16_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}