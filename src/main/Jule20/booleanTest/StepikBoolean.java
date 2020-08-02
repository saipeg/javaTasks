package main.Jule20.booleanTest;

public class StepikBoolean {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;
        int count = 0;
        System.out.println("счетчик на 0");

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

        if (count == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}


