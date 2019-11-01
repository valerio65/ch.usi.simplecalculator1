package ch.usi.simplejavacalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathOperationsTest {

    MathOperations m = new MathOperations();

    @Test
    public void xpowerofy() {
        assertEquals(1.0, m.xpowerofy(0.0, 0.0), 0.001);
        assertEquals(1.0, m.xpowerofy(2.0, 0.0), 0.001);
        assertEquals(0.0, m.xpowerofy(0.0, 2.0), 0.001);
        assertEquals(8.0, m.xpowerofy(2.0, 3.0), 0.001);
    }
}