package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_163 {
    private final Production52_163 production = new Production52_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}