package matrix;


             /*
Problem No: 73
Problem Title: Set Matrix Zero
Difficulty: Medium
URL: https://leetcode.com/problems/set-matrix-zeroes/?envType=study-plan-v2&envId=top-interview-150

Trick: Idea is marking array already in array itself.

                 */

import java.util.Arrays;

public class SetZeroFollowUp {
    void setZeroes(int[][] matrix) {
        boolean isCOl = false;
        int rowLen = matrix.length;
        int coLLen = matrix[0].length;

        for (int r = 0; r < rowLen; r++) {
            for (int c = 0; c < coLLen; c++) {
                if (matrix[r][c] == 0) {
                    matrix[0][c] = 0;
                    if (r > 0) {
                        matrix[r][0] = 0;
                    } else isCOl = true;
                }
            }
        }
        for (int r = 1; r < rowLen; r++) {
            for (int c = 1; c <coLLen; c++) {
                if (matrix[r][0] == 0 || matrix[0][c] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int r = 0; r < rowLen; r++) {
                matrix[r][0] = 0;
            }
        }

        if (isCOl) {
            for (int c = 0; c < coLLen; c++) {
                matrix[0][c] = 0;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 0,3}};
        SetZeroFollowUp pr = new SetZeroFollowUp();
        pr.setZeroes(arr);
    }
}
