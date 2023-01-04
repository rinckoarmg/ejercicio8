package code.bootcamp.example;

import java.util.ArrayList;

public class Zero {


    public static int[][] searchZero(int[][] matrix) {

        var newMatrix = MineUtils.copyInt(matrix);
        for (var row = 0; row < matrix.length; ++row) {
            for (var column = 0; column < matrix[row].length; ++column) {
                if (matrix[row][column] == 0) {
                    changeRow(newMatrix, row);
                    changeColumn(newMatrix, column);
                }
            }
        }
        return newMatrix;
    }

    private static void changeRow(int[][] newMatrix, int row) {
        for (int x = 0; x < newMatrix.length; ++x) {
            newMatrix[x][row] = 0;
        }
    }
    private static void changeColumn(int[][] newMatrix, int column) {
        for (int y = 0; y < newMatrix[0].length; y++) {
            newMatrix[column][y] = 0;
        }
    }


}