package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_353 {
    private final Production65_353 production = new Production65_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}