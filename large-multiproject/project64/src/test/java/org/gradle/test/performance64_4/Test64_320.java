package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_320 {
    private final Production64_320 production = new Production64_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}