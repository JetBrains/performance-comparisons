package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_257 {
    private final Production64_257 production = new Production64_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}