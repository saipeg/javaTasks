package main.August;

/* Stepik. Task 2.1
        Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
        Допустимая погрешность – 0.0001 (1E-4)

        Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
*/

public class DoubleExpression {

    public static void main(String[] args) {

        DoubleExpression doubleExpression = new DoubleExpression();

        System.out.println(doubleExpression.isMethodReturnCheck(0.1, 0.2, 0.3));
        System.out.println(doubleExpression.isMethodReturnCheck(0.2, 0.3, 0.5));
        System.out.println(doubleExpression.isMethodReturnCheck(0.1, 0.2, 0.2999));

    }

    public static boolean isMethodReturnCheck(double a, double b, double c) {

        return Math.abs((a + b) - c) <= 0.0001;

    }
}