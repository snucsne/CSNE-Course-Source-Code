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
package edu.snu.csne.csne2543.recursion;

public class FactorialCalculator
{
    public int recursiveFactorial( int n )
    {
        // Default to base case
        int result = 1;
        
        // Do we make a recursive call?
        if( 1 < n )
        {
            // Yes!
            result = n * recursiveFactorial( n - 1 );
        }
        
        return result;
    }
    
    public int iterativeFactorial( int n )
    {
        // Default to 1
        int result = 1;
        
        // Iterate through all the values from 1 to n
        for( int i = 1; i <= n; i++ )
        {
            result = result * i;
        }
        
        return result;
    }
    
    public static void main( String[] args )
    {
        FactorialCalculator calculator = new FactorialCalculator();
        
        int recursiveFactorialResult = recursiveFactorial( 5 );
        System.out.println( "Recursive: 5!=["
                + recursiveFactorialResult
                + "]" );

        int iterativeFactorialResult = iterativeFactorial( 5 );
        System.out.println( "Iterative: 5!=["
                + iterativeFactorialResult
                + "]" );

    }
}