package ExceptionDemos;

public class Arithmeticexp {
    public static void main(String[] args) {
        int[] num = {100, 200, 300, 400};
        int[] denom = {2, 2, 0, 2};

        for (int i = 0; i < num.length; i++) {
            System.out.println(divide(num[i], denom[i]));
        }

        System.out.println("Good Job");
    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return -1;
        }
    }
}
