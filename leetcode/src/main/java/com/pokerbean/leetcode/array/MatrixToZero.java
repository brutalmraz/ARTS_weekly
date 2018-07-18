package com.pokerbean.leetcode.array;

import java.util.*;

/**
 * @class: MatrixToZero.java
 * @version: 1.0
 * @author: CM
 * @e-mail: chenmao@danlu.com
 * @date: 2018/7/18 16:24
 * Created By IntelliJ  IDEA
 */
public class MatrixToZero {


    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };
        setZeroes2(matrix);
    }

    public static   int[][] setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        System.out.println(m +"*" +n);

        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (matrix[i][j]==0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (Integer r : row) {
            for (int i = 0; i <n ; i++) {
                matrix[r][i] = 0 ;
            }
        }

        for (Integer c : col) {
            for (int i = 0; i <m ; i++) {
                matrix[i][c] = 0 ;
            }
        }
        for (int[] ints : matrix) {
            String s = Arrays.toString(ints);
            System.out.println(s);
        }

        return matrix ;
    }


    public static   int[][] setZeroes2(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean [] row = new boolean[m];
        boolean [] col = new boolean[n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (matrix[i][j]==0) {
                    row[i]=true;
                    col[j] =true;
                }
            }
        }
        for (int j = 0; j < row.length; j++) {
            if (row[j]) {
                for (int i = 0; i <n ; i++) {
                    matrix[j][i] = 0 ;
                }
            }

        }
        for (int j = 0; j < col.length; j++) {
            if (col[j]) {
                for (int i = 0; i <m ; i++) {
                    matrix[i][j] = 0 ;
                }
            }

        }

        for (int[] ints : matrix) {
            String s = Arrays.toString(ints);
            System.out.println(s);
        }

        return matrix ;
    }

}
