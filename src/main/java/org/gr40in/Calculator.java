package org.gr40in;

import java.math.BigDecimal;

public class Calculator {

    public static <T extends Number, U extends Number> Number sum(T firstNumber, U secondNumber) {
        return firstNumber.doubleValue() + secondNumber.doubleValue();
    }

    public static <T extends Number, U extends Number> Number subtract(T firstNumber, U secondNumber) {
        return firstNumber.doubleValue() - secondNumber.doubleValue();
    }

    public static <T extends Number, U extends Number> Number divide(T firstNumber, U secondNumber) {
        if (secondNumber.intValue() == 0) throw new IllegalArgumentException("second Number cannot be Zero!");
        return firstNumber.doubleValue() / secondNumber.doubleValue();
    }

    public static <T extends Number, U extends Number> Number multiply(T firstNumber, U secondNumber) {
        return firstNumber.doubleValue() * secondNumber.doubleValue();
    }

}
