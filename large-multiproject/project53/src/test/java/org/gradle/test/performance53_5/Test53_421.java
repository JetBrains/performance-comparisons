package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_421 {
    private final Production53_421 production = new Production53_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}