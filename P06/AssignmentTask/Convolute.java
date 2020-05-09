/******************************************************
 * FILE: Convolute.java                               *
 * PURPOSE: Provides 2D arrays for tesing purposes    *
 * AUTHOR: Curtin University                          *
 * MODIFIED BY: ___________                           *
 * DATE CREATED: 24/03/2020                           *
 * LAST MOD: 26/03/2020, 4:12PM                       *
 ******************************************************/

public class Convolute
{
        /*
         * ARRAY_A contains a 6x6 matrix
         */
    public static final int[][] MATRIX_A =
        {
                {10, 10, 10,  0,  0,  0},
                {10, 10, 10,  0,  0,  0},
                {10, 10, 10,  0,  0,  0},
                {10, 10, 10,  0,  0,  0},
                {10, 10, 10,  0,  0,  0},
                {10, 10, 10,  0,  0,  0}
        }; 
        /*
         * ARRAY_B contains a 6x6 matrix
         */
    public static final int[][] MATRIX_B =
        {
                {3, 0, 1, 2, 7, 4},
                {1, 5, 8, 9, 3, 1},
                {2, 7, 2, 5, 1, 3},
                {0, 1, 3, 1, 7, 8},
                {4, 2, 1, 6, 2, 8},
                {2, 4, 5, 2, 3, 9}
        };
        /*
         * ARRAY_C contains a 11x6 matrix
         */
    public static final int[][] MATRIX_C =
        {
                {3, 0, 1, 2, 7, 4},
                {1, 5, 8, 9, 3, 1},
                {2, 7, 2, 5, 1, 3},
                {0, 1, 3, 1, 7, 8},
                {3, 0, 1, 2, 7, 4},
                {4, 2, 1, 6, 2, 8},
                {2, 7, 2, 5, 1, 3},
                {2, 7, 2, 5, 1, 3},
                {2, 7, 2, 5, 1, 3},
                {2, 7, 2, 5, 1, 3},
                {2, 7, 2, 5, 1, 3},
                {2, 4, 5, 2, 3, 9}
        };
        /*
         * ARRAY_D contains a 6x9 matrix
         */
    public static final int[][] MATRIX_D =
        {
                {3, 0, 1, 2, 7, 4, 4, 4, 4},
                {1, 5, 8, 9, 3, 1, 1, 1, 1},
                {2, 7, 2, 5, 1, 3, 3, 3, 3},
                {0, 1, 3, 1, 7, 8, 8, 8, 8},
                {3, 0, 1, 2, 7, 4, 4, 4, 4},
                {4, 2, 1, 6, 2, 8, 8, 8, 8}
        };
}

