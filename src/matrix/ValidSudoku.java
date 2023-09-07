package matrix;


          /*
Problem No: 36
Problem Title: Valid Sudoku
Difficulty: Medium
URL: https://leetcode.com/problems/valid-sudoku/?envType=study-plan-v2&envId=top-interview-150

Trick:

                 */

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {


    public boolean isValidSudoku(char[][] board) {

        int m = board.length;
        int n = board[0].length;
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();
        Set<Integer> diagonalSet = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int element = board[i][j];
                if (rowSet.contains(element)) {
                    return false;
                }
                rowSet.add(element);
            }

        }

        return true;
    }

}
