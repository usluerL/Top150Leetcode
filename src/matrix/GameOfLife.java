package matrix;

import java.util.Arrays;



           /*
Problem No: 289
Problem Title: Game Of Life
Difficulty: Medium
URL: https://leetcode.com/problems/game-of-life/description/?envType=study-plan-v2&envId=top-interview-150

Trick: CountLives method is good check the idea of directions array.

                 */

public class GameOfLife {


    public void gameOfLife(int[][] board) {
        int rL = board.length;
        int cL = board[0].length;
        int[][] boardCopy = new int[rL][cL];
        for (int r = 0; r < rL; r++) {
            for (int c = 0; c < cL; c++) {
                int liveNeighbors = countLiveNeighbors(board, r, c);
                if (board[r][c] == 1) {
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        boardCopy[r][c] = 0;
                    } else {
                        boardCopy[r][c] = 1;
                    }
                } else {
                    if (liveNeighbors == 3) {
                        boardCopy[r][c] = 1;
                    }

                }
            }

        }

        for (int i = 0; i < rL; i++) {
            System.arraycopy(boardCopy[i], 0, board[i], 0, cL);
        }

        System.out.println(Arrays.deepToString(board));

    }

    public int countLiveNeighbors(int[][] board, int row, int col) {
        int liveNeighbors = 0;
        int m = board.length;
        int n = board[0].length;

        int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1}, {0, 1},
                {1, -1}, {1, 0}, {1, 1}
        };

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && board[newRow][newCol] == 1) {
                liveNeighbors++;
            }
        }

        return liveNeighbors;
    }


    public static void main(String[] args) {
        GameOfLife pr = new GameOfLife();
        int[][] board = {
                {1,1}
        };

        pr.gameOfLife(board);

    }
}
