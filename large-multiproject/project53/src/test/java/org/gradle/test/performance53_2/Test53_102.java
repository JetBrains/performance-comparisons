package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_102 {
    private final Production53_102 production = new Production53_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}