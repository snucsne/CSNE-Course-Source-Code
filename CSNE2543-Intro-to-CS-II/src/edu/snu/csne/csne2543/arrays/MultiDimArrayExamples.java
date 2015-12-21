/*
 * The MIT License (MIT)
 * 
 * Copyright (c) 2015 Southern Nazarene University Computer Science/Network Engineering Department
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package edu.snu.csne.csne2543.arrays;

/**
 * @author Brent Eskridge
 */
public class MultiDimArrayExamples
{
    public static void main( String[] args )
    {
        // 2-dimensional array
        int[][] grid = new int[3][4];
        grid[1][2] = 3;
        
        // Iterate through a 2-dim array
        System.out.println( "2-dim array..." );
        for( int i = 0; i < grid.length; i++ )
        {
            for( int j = 0; j < grid[i].length; j++ )
            {
                System.out.println( "grid["
                        + i
                        + "]["
                        + j
                        + "]=["
                        + grid[i][j]
                        + "]" );
            }
        }
        System.out.println();
        
        // Create a ragged array
        int[][] ragged = new int[3][];
        ragged[0] = new int[2];
        ragged[1] = new int[1];
        ragged[2] = new int[3];
        
        // Iterate through it
        System.out.println( "Ragged array..." );
        for( int i = 0; i < ragged.length; i++ )
        {
            for( int j = 0; j < ragged[i].length; j++ )
            {
                System.out.println( "ragged["
                        + i
                        + "]["
                        + j
                        + "]=["
                        + ragged[i][j]
                        + "]" );
            }
        }

        // Use an array initializer
        int[][] anotherRagged = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9} };
        
        // 4-dimensional array
        boolean[][][][] confusing = new boolean[2][3][4][5];
    }
}
