package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_417 {
    private final Production34_417 production = new Production34_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}