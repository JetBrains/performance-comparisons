package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_44 {
    private final Production81_44 production = new Production81_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}