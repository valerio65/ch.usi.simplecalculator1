package ch.usi.simplejavacalculator;

import org.junit.Test;
import ch.usi.simplejavacalculator.*;

import static org.junit.Assert.*;

public class MathOperationsTest {

    private final double delta = 0.0000001;

    // Test for oneDividedBy

    @Test
    public void normalScenarios() {
        double positive = 1 ;
        double negative = -1 ;
        double positive2 = 40 ;
        double negative2 = -40 ;
        // assert statements
        assertEquals(1, MathOperations.oneDividedBy(positive), delta);
        assertEquals(-1, MathOperations.oneDividedBy(negative), delta);
        assertEquals(0.025, MathOperations.oneDividedBy(positive2), delta);
        assertEquals(-0.025, MathOperations.oneDividedBy(negative2), delta);
    }

    @Test
    public void abnormalScenarios(){
        double zero = 0;
        // assert statements
        assertEquals(0, MathOperations.oneDividedBy(zero), delta);
        // ∀ x ∈ R,  1/x != 0
    }

    private static final double DELTA = 1e-15;


    @Test
    public void test1() {
        assertEquals(MathOperations.rate(50.0), 0.5, DELTA);
    }

    @Test
    public void test2() {
        assertEquals(MathOperations.rate(123.4), 1.234, DELTA);
    }

    @Test
    public void square0(){
        assertEquals(0D,MathOperations.square(0D),delta);
    }

    @Test
    public void square1(){
        assertEquals(4D,MathOperations.square(2D),delta);
    }

    @Test
    public void square2(){
        assertEquals(100D,MathOperations.square(-10D),delta);
    }

    @Test
    public void log0(){ assertEquals(1D, MathOperations.log(10D), delta); }

    @Test
    public void log1(){ assertEquals(Double.NaN, MathOperations.log(-1D), delta); }

    @Test
    public void log2(){ assertEquals(Double.POSITIVE_INFINITY, MathOperations.log(Double.POSITIVE_INFINITY), delta); }

    @Test
    public void log3(){ assertEquals(Double.NEGATIVE_INFINITY, MathOperations.log(0D), delta); }

    @Test
    public void log4(){ assertEquals(Double.NEGATIVE_INFINITY, MathOperations.log(-0D), delta); }
    
    @Test
    public void xpowerofy() {
        assertEquals(1.0, m.xpowerofy(0.0, 0.0), delta);
        assertEquals(1.0, m.xpowerofy(2.0, 0.0), delta);
        assertEquals(0.0, m.xpowerofy(0.0, 2.0), delta);
        assertEquals(8.0, m.xpowerofy(2.0, 3.0), delta);
    }
    
    @Test
    public void cos() {
        assertEquals( 1.0, m.cos(0.0), delta);
        assertEquals(-1.0, m.cos(Math.PI), delta);
        assertEquals( 1.0, m.cos(Math.PI * 2), delta);
        assertEquals(-1.0, m.cos(Math.PI * 3), delta);
    }
}
