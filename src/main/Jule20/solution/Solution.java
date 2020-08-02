package main.Jule20.solution;

class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println("min val: " + getMin(1, 2));
        System.out.println("min val: " + getMin(3, 2));
        System.out.println("min val: " + getMin(-11, -2));
        System.out.println("min val: " + getMin(-11, -11));
    }

    public static int getMin(int a, int b) throws Exception {
        return a < b ? a : b;
    }
}