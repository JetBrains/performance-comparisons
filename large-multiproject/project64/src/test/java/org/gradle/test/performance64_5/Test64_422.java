package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_422 {
    private final Production64_422 production = new Production64_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}