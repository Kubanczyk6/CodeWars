package kata4.sudokuSolutionValidator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {
    public static void main(String[] args) {
        int[][] sudoku = new int[][]{
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
        {6, 7, 2, 1, 9, 5, 3, 4, 8},
        {1, 9, 8, 3, 4, 2, 5, 6, 7},
        {8, 5, 9, 7, 6, 1, 4, 2, 3},
        {4, 2, 6, 8, 5, 3, 7, 9, 1},
        {7, 1, 3, 9, 2, 4, 8, 5, 6},
        {9, 6, 1, 5, 3, 7, 2, 8, 4},
        {2, 8, 7, 4, 1, 9, 6, 3, 5},
        {3, 4, 5, 2, 8, 6, 1, 7, 9},
        {6, 2, 4, 6, 7, 8, 9, 1, 2},
        {5, 8, 2, 1, 9, 5, 3, 4, 8},
        {1, 9, 8, 3, 4, 2, 5, 6, 7},
        {8, 5, 9, 7, 6, 1, 4, 2, 3},
        {4, 2, 6, 8, 5, 3, 7, 9, 1},
        {7, 1, 3, 9, 2, 4, 8, 5, 6},
        {9, 6, 1, 5, 3, 7, 2, 8, 4},
        {2, 8, 7, 4, 1, 9, 6, 3, 5},
        {3, 4, 5, 2, 8, 6, 1, 7, 9},
        {5, 3, 4, 6, 7, 8, 9, 1, 2},
        {6, 7, 2, 1, 9, 5, 3, 4, 8},
        {1, 9, 8, 3, 4, 2, 5, 6, 7},
        {8, 5, 9, 7, 6, 1, 4, 2, 3},
        {4, 2, 6, 8, 0, 3, 7, 9, 1},
        {7, 1, 3, 9, 2, 4, 8, 5, 6},
        {9, 6, 1, 5, 3, 7, 2, 8, 4},
        {2, 8, 7, 4, 1, 9, 6, 3, 5},
        {3, 4, 5, 2, 8, 6, 1, 7, 9},
        };

        System.out.println(check(sudoku));
    }

    public static boolean check(int[][] sudoku) {

        for (int[] ints : sudoku) {
            for (int anInt : ints) {
                if(anInt<1||anInt>9||ints.length != 9 || sudoku.length != 9){
                    return false;
                }
            }
        }

        for (int[] ints : sudoku) {
            for (int j = 0; j < ints.length; j++) {
                for (int k = j + 1; k < ints.length; k++) {
                    if (ints[j] == ints[k]) {
                        return false;
                    }
                }
            }
        }

        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < sudoku.length / 3; i++) {
            for (int j = 0; j < sudoku[i].length / 3; j++) {
                set1.add(sudoku[i][j]);
            }
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < sudoku.length / 3; i++) {
            for (int j = 3; j < sudoku[i].length / 3 + 3; j++) {
                set2.add(sudoku[i][j]);
            }
        }
        Set<Integer> set3 = new HashSet<>();
        for (int i = 0; i < sudoku.length / 3; i++) {
            for (int j = 6; j < sudoku[i].length / 3 + 6; j++) {
                set3.add(sudoku[i][j]);
            }
        }
        Set<Integer> set4 = new HashSet<>();
        for (int i = 3; i < sudoku.length / 3 + 3; i++) {
            for (int j = 0; j < sudoku[i].length / 3; j++) {
                set4.add(sudoku[i][j]);
            }
        }
        Set<Integer> set5 = new HashSet<>();
        for (int i = 3; i < sudoku.length / 3 + 3; i++) {
            for (int j = 3; j < sudoku[i].length / 3 + 3; j++) {
                set5.add(sudoku[i][j]);
            }
        }
        Set<Integer> set6 = new HashSet<>();
        for (int i = 3; i < sudoku.length / 3 + 3; i++) {
            for (int j = 6; j < sudoku[i].length / 3 + 6; j++) {
                set6.add(sudoku[i][j]);
            }
        }
        Set<Integer> set7 = new HashSet<>();
        for (int i = 6; i < sudoku.length / 3 + 6; i++) {
            for (int j = 0; j < sudoku[i].length / 3; j++) {
                set7.add(sudoku[i][j]);
            }
        }
        Set<Integer> set8 = new HashSet<>();
        for (int i = 6; i < sudoku.length / 3 + 6; i++) {
            for (int j = 3; j < sudoku[i].length / 3 + 3; j++) {
                set8.add(sudoku[i][j]);
            }
        }
        Set<Integer> set9 = new HashSet<>();
        for (int i = 6; i < sudoku.length / 3 + 6; i++) {
            for (int j = 6; j < sudoku[i].length / 3 + 6; j++) {
                set9.add(sudoku[i][j]);
            }
        }
        if (set1.size() != 9 || set2.size() != 9 || set3.size() != 9 || set4.size() != 9 || set5.size() != 9 || set6.size() != 9 || set7.size() != 9 || set8.size() != 9 || set9.size() != 9) {
            return false;
        }

        return true;
    }
}
