package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_140 {
    private final Production34_140 production = new Production34_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}