package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_416 {
    private final Production91_416 production = new Production91_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}