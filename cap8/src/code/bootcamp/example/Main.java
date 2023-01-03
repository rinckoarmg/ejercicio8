package code.bootcamp.example;

import java.util.ArrayList;

public class Main {

    private static String print(char[][] board){
        var builder = new StringBuilder();
        for (char[] row : board) {
            for (char cell : row) {
                builder.append(cell);
            }
            builder.append(System.lineSeparator());
        }
        return builder.toString();
    }

    private static char[][] addHints(char[][] board){
        var newBoard = MineUtils.copy(board);
        for (var row = 0; row < newBoard.length; ++row) {
            for (var column = 0; column < newBoard[row].length; ++column){
                if(newBoard[row][column] == '.'){
                    var mineCount = MineUtils.search(row, column, newBoard);
                    if( mineCount > 0) {
                        newBoard[row][column] = Character.forDigit(mineCount, 10);
                    }
                }
            }
        }
        return newBoard;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'.', '.', '.', '.'},
                {'.', '*', '.', '.'},
                {'.', '*', '*', '.'}
        };
        var newBoard = addHints(board);
        System.out.println(print(newBoard));
    }
}
