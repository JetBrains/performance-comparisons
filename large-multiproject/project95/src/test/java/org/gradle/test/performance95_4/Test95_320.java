package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_320 {
    private final Production95_320 production = new Production95_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}