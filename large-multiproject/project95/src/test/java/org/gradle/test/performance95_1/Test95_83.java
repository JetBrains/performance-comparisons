package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_83 {
    private final Production95_83 production = new Production95_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}