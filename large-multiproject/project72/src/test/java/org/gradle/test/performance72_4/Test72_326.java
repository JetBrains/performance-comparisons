package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_326 {
    private final Production72_326 production = new Production72_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}