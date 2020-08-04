package main.Jule20.booleanTest;

class StepikBoolean {

    public static void main(String[] args) {
        StepikBoolean stepikBoolean = new StepikBoolean();

        boolean allFourArgumentsTrue = stepikBoolean.isMethodReturnTrue(true, true, true, true);
        System.out.println("method return: " + allFourArgumentsTrue);

        boolean oneArgumentIsFalse = stepikBoolean.isMethodReturnTrue(true, true, true, false);
        System.out.println("method return: " + oneArgumentIsFalse);

        boolean twoArgumentsIsFalse = stepikBoolean.isMethodReturnTrue(true, true, false, false);
        System.out.println("method return: " + twoArgumentsIsFalse);

        boolean threeArgumentsIsFalse = stepikBoolean.isMethodReturnTrue(true, false, false, false);
        System.out.println("method return: " + threeArgumentsIsFalse);

        boolean allArgumentsIsFalse = stepikBoolean.isMethodReturnTrue(false, false, false, false);
        System.out.println("method return: " + allArgumentsIsFalse);


    }

    public boolean isMethodReturnTrue(boolean a, boolean b, boolean c, boolean d) {
        int count = 0;

        if (a == true) {
            count++;
        }

        if (b == true) {
            count++;
        }

        if (c == true) {
            count++;
        }

        if (d == true) {
            count++;
        }

        return count == 2;
    }
}