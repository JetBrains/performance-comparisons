package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_43 {
    private final Production67_43 production = new Production67_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}