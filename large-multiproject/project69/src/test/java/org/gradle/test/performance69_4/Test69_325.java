package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_325 {
    private final Production69_325 production = new Production69_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}