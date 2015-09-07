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
package edu.snu.csne.csne2923.alganalysis; 

/**
 * A simple class to demonstrate the real-world efficiency of different
 * algorithms for summing integers.  This is taken from the textbook
 * "Data Structres and Abstractions with Java, 4th Edition" by
 * Carrano and Henry.
 *
 * @author Brent Eskridge
 */
public class SummingProblem
{
    /**
     * The main entry point of the application
     *
     * @param args Command line arguments
     */
    public static void main( String[] args )
    {
        /* Perform each algorithm a number of times to get the average
         * time till completion. */
        int numberOfSummations = 500;
        int n = 10000;
        System.out.println( "Using: n=["
                + n
                + "]    numberOfSummations=["
                + numberOfSummations
                + "]" );

        // Perform Algorithm A
        long startTime = System.currentTimeMillis();
        for( int i = 0; i < numberOfSummations; i++ )
        {
            performAlgorithmA( n );
        }
        long endTime = System.currentTimeMillis();
        System.out.println( "Alg. A ["
                + ((endTime - startTime) / (float) numberOfSummations)
                + "] ms" );

        // Perform Algorithm B
        startTime = System.currentTimeMillis();
        for( int i = 0; i < numberOfSummations; i++ )
        {
            performAlgorithmB( n );
        }
        endTime = System.currentTimeMillis();
        System.out.println( "Alg. B ["
                + ((endTime - startTime) / (float) numberOfSummations)
                + "] ms" );

        // Perform Algorithm C
        startTime = System.currentTimeMillis();
        for( int i = 0; i < numberOfSummations; i++ )
        {
            performAlgorithmC( n );
        }
        endTime = System.currentTimeMillis();
        System.out.println( "Alg. C ["
                + ((endTime - startTime) / (float) numberOfSummations)
                + "] ms" );
    }


    /**
     * A simple implementation of Algorithm A from the textbook which computes
     * the sum of the integers from 1 to n using a single for loop.
     *
     * @param n The stopping point of the sum
     *
     * @return The sum of the integers between 1 and n
     */
    public static long performAlgorithmA( long n )
    {
        long sum = 0;

        for( long i = 1; i <= n; ++i )
        {
            sum += i;
        }

        return sum;
    }

    /**
     * A simple implementation of Algorithm B from the textbook which computes
     * the sum of the integers from 1 to n using two for loops.
     *
     * @param n The stopping point of the sum
     *
     * @return The sum of the integers between 1 and n
     */
    public static long performAlgorithmB( long n )
    {
        long sum = 0;

        for( long i = 1; i <= n; ++i )
        {
            for( long j = 1; j <= i; ++j )
            {
                sum++;
            }
        }

        return sum;
    }

    /**
     * A simple implementation of Algorithm C from the textbook which computes
     * the sum of the integers from 1 to n using an equation.
     *
     * @param n The stopping point of the sum
     *
     * @return The sum of the integers between 1 and n
     */
    public static long performAlgorithmC( long n )
    {
        long sum = n * (n + 1) / 2;

        return sum;
    }

}
