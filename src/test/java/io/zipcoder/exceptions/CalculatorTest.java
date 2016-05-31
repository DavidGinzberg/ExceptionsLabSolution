package io.zipcoder.exceptions;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

    @Test
    public void testAddition(){
        Assert.assertEquals(7+12, Calculator.add(7,12));
    }

    @Test
    public void testSubtraction(){
        Assert.assertEquals(32-14, Calculator.subtract(32,14));
    }

    @Test
    public void testMultiplication(){
        Assert.assertEquals((long)14 * -12, Calculator.multiply(14, -12));
    }

    @Test
    public void testDivisionHappyPath(){
        try {
            Assert.assertEquals(18 / 7.0, Calculator.divide(18, 7), 0.0001);
        }
        catch (DivisionByZeroException e){
            Assert.fail("Exception occurred during happy-path division test.");
        }
    }

    @Test(expected = DivisionByZeroException.class)
    public void testDivisionByZero() throws DivisionByZeroException{
        Assert.assertEquals(0, Calculator.divide(5, 0), 0.001);
    }

    @Test
    public void testSquareRootHappyPath(){
        try {
            Assert.assertEquals(Math.sqrt(17), Calculator.squareRoot(17), 0.0001);
        }
        catch (ComplexNumberException e){
            Assert.fail("Encountered ComplexNumberException on happy path test of Calculator.squareRoot.");
        }
    }

    @Test(expected = ComplexNumberException.class)
    public void testSquareRootOfNegativeNumber() throws ComplexNumberException {
        Calculator.squareRoot(-5);
    }

}
