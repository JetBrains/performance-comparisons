package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_61 {
    private final Production69_61 production = new Production69_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}