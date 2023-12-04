package Homework1.calculator;

import static org.assertj.core.api.Assertions.*; // Импортируем классы библиотеки assertJ

public class CalculatorTest {
    public static void main(String[] args) {
        // ДОМАШНЕЕ задание к семинару
        //проверяем калькулятор скидок, что считает правильно и выдаёт требуемые ошибки при неверных аргументах
        assertThat(Calculator.calculatingDiscount(100.0,25)).isEqualTo(75);
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(-10.0,10)
        ).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(100.0,28)
        ).isInstanceOf(IllegalArgumentException.class);


        // классная работа
        // Проверка через IF :
        if (11 != Calculator.calculation(3, 8, '+')) {
            throw new AssertionError("Ошибка при сложении");
        }

        if (20.2 != Calculator.calculation(22.2, 2, '-')) {
            throw new AssertionError("Ошибка при вычитании");
        }

        if (11.0 != Calculator.calculation(5.5, 2, '*')) {
            throw new AssertionError("Ошибка при умножении");
        }

        if (11.3 != Calculator.calculation(22.6, 2, '/')) {
            throw new AssertionError("Ошибка при делении");
        }

        // Проверка с использованием стандартной функции assert:
        assert 11 == Calculator.calculation(3, 8, '+');
        assert 20.2 == Calculator.calculation(22.2, 2, '-');
        assert 10.8 == Calculator.calculation(5.4, 2, '*');
        assert 11.3 == Calculator.calculation(22.6, 2, '/');

        // Проверка с использованием утверждений AssertJ:
        assertThat(Calculator.calculation(8, 3, '+')).isEqualTo(11);
        assertThat(Calculator.calculation(22.2, 2, '-')).isEqualTo(20.2);
        assertThat(Calculator.calculation(5.2, 2, '*')).isEqualTo(10.4);
        assertThat(Calculator.calculation(22.6, 2, '/')).isEqualTo(11.3);

        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
        assertThatThrownBy(() ->
                Calculator.calculation(8, 4, '_')
        ).isInstanceOf(IllegalStateException.class);

    }
}