package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_155 {
    private final Production18_155 production = new Production18_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}