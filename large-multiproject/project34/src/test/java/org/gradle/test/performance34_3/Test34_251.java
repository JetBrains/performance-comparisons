package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_251 {
    private final Production34_251 production = new Production34_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}