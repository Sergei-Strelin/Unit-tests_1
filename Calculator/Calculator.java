package Homework1.calculator;

import static java.lang.Math.round;

public class Calculator {
    // ДОМАШНЕЕ задание:
    // В классе Calculator создайте метод calculateDiscount,
    // который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
    // Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
    // Если метод calculateDiscount получает недопустимые аргументы,
    // он должен выбрасывать исключение ArithmeticException.
    // Не забудьте написать тесты для проверки этого поведения.
    public static double calculatingDiscount(double purchaseAmount, double discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        double MAX_DISCOUNT = 25;      // максимально возможный размер скидки
        if (discountAmount > MAX_DISCOUNT) {    // скидка не должна быть больше максимальной
            throw new IllegalArgumentException("Размер скидки не может быть больше " + MAX_DISCOUNT + " %");
        }
        if (purchaseAmount <= 0) {        // стоимость покупки должна быть положительной
            throw new IllegalArgumentException("Сумма покупки должна быть больше нуля!");
        }
        return purchaseAmount - purchaseAmount * (discountAmount / 100);
    }

    // классная работа
    public static double calculation(double firstOperand, double secondOperand, char operator) {
        double result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Делить на 0 нельзя");
                }
            default:
                throw new IllegalStateException("Не известный оператор действия: " + operator);
        }
        return result;
    }



}