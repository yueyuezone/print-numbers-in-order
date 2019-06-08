package com.github.hcsp.calculation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void test() {
        int a = new java.util.Random().nextInt(1000);
        assertEquals(
                String.format("%d>%d>%d", a + 1, a, a - 1),
                Main.printNumbersInOrder(a, a - 1, a + 1));
        assertEquals(
                String.format("%d>%d>%d", a + 1, a, a - 1),
                Main.printNumbersInOrder(a, a + 1, a - 1));
    }
}
