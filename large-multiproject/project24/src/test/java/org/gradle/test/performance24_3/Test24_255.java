package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_255 {
    private final Production24_255 production = new Production24_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}