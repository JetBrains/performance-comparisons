package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_326 {
    private final Production33_326 production = new Production33_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}