package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_45 {
    private final Production68_45 production = new Production68_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}