package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_40 {
    private final Production96_40 production = new Production96_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}