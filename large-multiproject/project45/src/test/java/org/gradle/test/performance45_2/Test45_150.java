package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_150 {
    private final Production45_150 production = new Production45_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}