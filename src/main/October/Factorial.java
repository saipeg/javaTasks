/* Реализуйте метод, вычисляющий факториал заданного натурального числа.

Факториал NN вычисляется как 1 \cdot 2 \cdot ... \cdot N1⋅2⋅...⋅N.

Поскольку это очень быстро растущая функция, то даже для небольших NN вместимости типов int и long очень скоро не хватит.
Поэтому будем использовать BigInteger.

 */

package main.October;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger calculateFactorial(int value) {

        BigInteger ret = BigInteger.ONE;

        for (int i = 1; i <= value; ++i) {
            ret = ret.multiply(BigInteger.valueOf(i));
        }
        return ret;

    }

    public static void main(String[] args) {

        BigInteger result = calculateFactorial(3);
        System.out.println(result);

    }

}



