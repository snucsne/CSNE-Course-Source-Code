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
public class SingleDimArrayExamples
{
    public static void main( String[] args )
    {
        // Declare an array variable
        boolean[] flags = null;
        boolean confusing[] = null; // Don't do this
        
        // Create the array
        flags = new boolean[10];

        // Create and declare an array of ints
        int[] counters = new int[10];
        
        // Create and declare an array of floats
        float[] grades = new float[10];
        
        System.out.println( "First grade=["
                + grades[0]
                + "]" );
        
        // Set values in the array
        grades[0] = 91.3f;
        grades[1] = 87.8f;
        
        // The array knows its length
        System.out.println( "length=["
                + grades.length
                + "]" );
        
        // Shorthand for declaring and initializing an array
        int[] daysInMonth = { 31, 28, 31, 30,
                              31, 30, 31, 31,
                              30, 31, 30, 31 };
        
        // Iterate through an array
        for( int i = 0; i < daysInMonth.length; i++ )
        {
            System.out.println( "i=["
                    + i
                    + "] element=["
                    + daysInMonth[i]
                    + "]" );
        }
        
        // Can also iterate with a special for loop
        // No access to index though
        for( float grade : grades )
        {
            System.out.println( "grade=[" + grade + "]" );
        }
        
        // Don't go past the end of an array!
        System.out.println( "error=["
                + grades[42]
                + "]" );
    }
}
