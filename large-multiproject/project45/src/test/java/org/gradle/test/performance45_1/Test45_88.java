package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_88 {
    private final Production45_88 production = new Production45_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}