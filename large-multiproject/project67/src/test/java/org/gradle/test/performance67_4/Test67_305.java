package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_305 {
    private final Production67_305 production = new Production67_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}