package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_111 {
    private final Production65_111 production = new Production65_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}