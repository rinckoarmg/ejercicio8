package code.bootcamp.example;

import java.util.ArrayList;

public class Zero {

    ArrayList<Integer> x = new int[];
    ArrayList<Integer> y = new int[];

    public char[][] searchZero(char[][] matrix){

        var newMatrix = MineUtils.copy(matrix);
        for (var row = 0; row < newMatrix.length; ++row) {
            for (var column = 0; column < newMatrix[row].length; ++column) {
                if(newMatrix[row][column] == 0){
                    x.add(row);
                    y.add(column);
                }
            }
        }
        return newMatrix;
    }

    public char[][] changeDigit(char[][] newMatrix){
        var posX= x.toArray();
        var posY = y.toArray();
        for (int i = 0; i < posX.length; ++i) {
            newMatrix[posX[i]][posY[i]] = 0;
        }
    }
}
