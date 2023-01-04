package code.bootcamp.example;

import java.util.Arrays;

public class MineUtils {

    private static final int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static int search(int x, int y, char[][]matrix) {
        var count = 0;
        for (var i = 0; i < dx.length; ++i) {
            var nx = x + dx[i];
            var ny = y + dy[i];
            if (isValid(nx, ny, matrix) && isMine(matrix[nx][ny])) {
                ++count;
            }
        }
        return count;
    }

    public static boolean isValid(int x, int y, char[][]matrix) {
        return x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length;
    }

    public static boolean isMine(char data) {
        return data == '*';
    }

    public static char[][] copy(char[][] matrix){
        var copy = Arrays.copyOf(matrix, matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            copy[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        }
        return copy;
    }

    public static int[][] copyInt(int[][] matrix){
        var copy = Arrays.copyOf(matrix, matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            copy[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        }
        return copy;
    }
}
