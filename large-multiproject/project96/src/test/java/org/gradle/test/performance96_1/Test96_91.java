package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_91 {
    private final Production96_91 production = new Production96_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}