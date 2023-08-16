package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;



             /*
Problem No: 73
Problem Title: Set Matrix Zero
Difficulty: Medium
URL: https://leetcode.com/problems/set-matrix-zeroes/?envType=study-plan-v2&envId=top-interview-150

Trick: Keep a boolean array and update rows and cols if field is "false" space complexity O(m*n)
ps: follow up another in another class

                 */

public class SetZero {

    List<ArrayList<Boolean>> checkList = new ArrayList<>();


    void setZeroes(int[][] matrix) {
        int rL = matrix.length;
        int cL = matrix[0].length;
        fillArr(rL, cL);
        System.out.println(checkList);
        for (int r = 0; r < rL; r++) {
            for (int c = 0; c < cL; c++) {
                if (!checkList.get(r).get(c) && matrix[r][c] == 0) {
                    setColToZeros(matrix, c);
                    setRowToZeros(matrix, r);
                }
            }
        }
        System.out.println("last: " + checkList);
        System.out.println(Arrays.deepToString(matrix));
    }

    void setColToZeros(int[][] matrix, int col) {
        for (int r = 0; r < matrix.length; r++) {
            if (matrix[r][col] != 0) {
                checkList.get(r).set(col, true);
            }
            matrix[r][col] = 0;
        }
    }

    void setRowToZeros(int[][] matrix, int row) {

        for (int c = 0; c < matrix[row].length; c++) {
            if (matrix[row][c] != 0) {
                checkList.get(row).set(c, true);
            }
            matrix[row][c] = 0;
        }
    }

    public static void main(String[] args) {
        SetZero pr = new SetZero();
        int[][] arr = {{0,1,2,0}, {3, 4, 5,2}, {1, 3, 1,5}};

        pr.setZeroes(arr);
    }

    void fillArr(int numRows, int numCols) {
       this.checkList = IntStream.range(0, numRows)
                .mapToObj(row -> {
                    ArrayList<Boolean> rowList = new ArrayList<>();
                    IntStream.range(0, numCols).forEach(col -> rowList.add(false));
                    return rowList;
                }).toList();
    }
}


