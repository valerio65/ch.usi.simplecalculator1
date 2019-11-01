package ch.usi.simplejavacalculator;


import org.apache.commons.math3.util.FastMath;

public class MathOperations {


    protected static Double add(Double num1, Double num2) {
        return num1 + num2;
    }

    protected static Double minus(Double num1, Double num2) {
        return num1 - num2;
    }
    protected static Double multiply(Double num1, Double num2) {
        //TODO
        return 0.0;
    }
    protected static Double divide(Double num1, Double num2) {
        //TODO
        return 0.0;
    }
    protected static Double xpowerofy(Double num1, Double num2) {
        if (y == 0)
            return 1;
        else if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        else
            return x * power(x, y / 2) * power(x, y / 2);
    }

    protected static Double square(Double num1) {
        return num1*num1;
    }


    protected static Double squareRoot(Double num1) {
        //TODO
        return 0.0;
    }

    protected static Double oneDividedBy(Double num1){
        double result;
        try {
            if (num1 == 0) {
                throw new Exception("Division by zero");
            } else {
                result = 1 / num1;
            }
        } catch (Exception e) {
            // Division by zero
            result = 0;
            // ∀ x ∈ R,  1/x != 0
        }
        return result;
    }

    protected static Double cos(Double num1) {
        //TODO
        return 0.0;
    }

    protected static Double sin(Double num1) {
        //TODO
        return 0.0;
    }

    protected static Double tan(Double num1) {
        return 0.0;
    }

    protected static Double log(Double num1) {
        return Math.log10(num1);
    }

    protected static Double rate(Double num1) {return num1/100; }



}
