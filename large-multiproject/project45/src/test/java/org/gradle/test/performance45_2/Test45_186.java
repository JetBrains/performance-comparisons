package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_186 {
    private final Production45_186 production = new Production45_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}