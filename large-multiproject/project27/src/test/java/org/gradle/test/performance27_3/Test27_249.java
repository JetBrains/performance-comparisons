package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_249 {
    private final Production27_249 production = new Production27_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}