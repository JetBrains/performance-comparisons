package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_39 {
    private final Production34_39 production = new Production34_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}