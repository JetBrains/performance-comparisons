package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_449 {
    private final Production51_449 production = new Production51_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}