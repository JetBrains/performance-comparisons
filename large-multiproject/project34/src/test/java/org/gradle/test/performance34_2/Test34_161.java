package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_161 {
    private final Production34_161 production = new Production34_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}