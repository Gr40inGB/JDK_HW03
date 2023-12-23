package org.gr40in;

public class Calculator {

    public static <T extends Number, V extends Number> Number sum(T firstNumber, V secondNumber) {
        return firstNumber.doubleValue() + secondNumber.doubleValue();
    }

    public static <T extends Number, V extends Number> Number subtract(T firstNumber, V secondNumber) {
        return firstNumber.doubleValue() - secondNumber.doubleValue();
    }

    public static <T extends Number, V extends Number> Number divide(T firstNumber, V secondNumber) {
        if (secondNumber.intValue() == 0) throw new IllegalArgumentException("second Number cannot be Zero!");
        return firstNumber.doubleValue() / secondNumber.doubleValue();
    }

    public static <T extends Number, V extends Number> Number multiply(T firstNumber, V secondNumber) {
        return firstNumber.doubleValue() * secondNumber.doubleValue();
    }

}
