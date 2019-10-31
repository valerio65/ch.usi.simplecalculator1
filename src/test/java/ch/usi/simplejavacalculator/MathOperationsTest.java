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

}