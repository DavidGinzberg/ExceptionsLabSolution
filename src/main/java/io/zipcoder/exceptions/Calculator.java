package io.zipcoder.exceptions;


public class Calculator {

    public static int add(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }

    public static long multiply(int x, int y){
        return (long)x * y;
    }

    public static double divide(int x, int y) throws DivisionByZeroException{
        if(y == 0) throw new DivisionByZeroException();

        return x / (double)y;
    }

    public static double squareRoot(int x) throws ComplexNumberException{
        if(x < 0) throw new ComplexNumberException();
        return Math.sqrt(x);
    }
}
