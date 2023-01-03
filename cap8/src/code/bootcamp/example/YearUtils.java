package code.bootcamp.example;

public class YearUtils {
    public static boolean isLeap(int year) {
        return Math.isMultiple(year, 4) && (Math.isMultiple(year, 400) || !Math.isMultiple(year, 100));
    }
}
