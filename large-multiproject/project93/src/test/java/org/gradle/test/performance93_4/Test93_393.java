package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_393 {
    private final Production93_393 production = new Production93_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}