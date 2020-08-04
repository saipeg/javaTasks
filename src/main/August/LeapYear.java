package main.August;

class LeapYear {
    public static void main(String[] args) {

        LeapYear leapYear = new LeapYear();

        leapYear.isMethodReturnLeap(1500);

    }

    void isMethodReturnLeap(int year) {
        int leap = (year / 4) - (year / 100) + (year / 400);
        System.out.println("В введеном вами колличестве лет: " + year + " точное число високостных лет равно: " + leap);
    }

}
