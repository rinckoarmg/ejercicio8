package code.bootcamp.example;

public class Math {
    public static boolean isMultiple(int a, int b) {
        return a % b == 0;
    }

    public static boolean isEven(int n) {
        return isMultiple(n, 2);
    }

    public static boolean isOdd(int n) {
        return !isEven(n);
    }
}
