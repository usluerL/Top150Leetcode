package matrix;

import java.util.Arrays;


           /*
Problem No: 289
Problem Title: Game Of Life
Difficulty: Medium
URL: https://leetcode.com/problems/game-of-life/description/?envType=study-plan-v2&envId=top-interview-150

Trick: Instead of updating 1 and zero only if it is turned from 1 to 0 mark it -1, 0 to 1 mark it 2.

                 */


public class GameOfLifeFollowUp {

    public void gameOfLife(int[][] board) {

        int rL = board.length;
        int cL = board[0].length;
        for (int r = 0; r < rL; r++) {
            for (int c = 0; c < cL; c++) {
                int liveNeighbors = countLiveNeighbors(board, r, c);
                if (board[r][c] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[r][c] = -1;
                }
                if (board[r][c] == 0 && liveNeighbors == 3) {
                    board[r][c] = 2;
                }
            }

        }

        for (int i = 0; i < rL; i++) {
            for (int j = 0; j < cL; j++) {
                if (board[i][j] == -1) {
                    board[i][j] = 0;
                } else if (board[i][j] == 2) {
                    board[i][j] = 1;
                }
            }
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
            if (newRow >= 0 && newRow < m
                    && newCol >= 0 && newCol < n) {
                if (board[newRow][newCol] == 1 || board[newRow][newCol] == -1)
                    liveNeighbors++;
            }


        }

        return liveNeighbors;
    }


    public static void main(String[] args) {
        GameOfLife pr = new GameOfLife();
        int[][] board = {
                {1, 1}
        };

        pr.gameOfLife(board);

    }
}


