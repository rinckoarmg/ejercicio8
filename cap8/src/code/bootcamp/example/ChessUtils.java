package code.bootcamp.example;

import java.time.LocalDateTime;

public class ChessUtils {

    private static final int[] dx = {-2,-2,-1,-1, 1, 1, 2, 2};
    private static final int[] dy = {-1, 1,-2, 2,-2, 2,-1, 1};

    public static int knightMoves(int x, int y) {
        var count = 0;
        for (var i = 0; i < dx.length; ++i) {
            var nx = x + dx[i];
            var ny = y + dy[i];
            if (isValid(nx, ny)) {
                ++count;
            }
        }
        return count;
    }

    private static boolean isValid(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }
}
