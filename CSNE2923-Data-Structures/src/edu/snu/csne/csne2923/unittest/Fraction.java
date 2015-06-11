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
package edu.snu.csne.csne2923.unittest;

/**
 * TODO Class description
 *
 * @author Brent Eskridge
 */
public class Fraction
{
    /** Numerator value */
    private int _numerator = 0;
    
    /** Denominator value */
    private int _denominator = 0;
    
    
    /**
     * Builds this Fraction object using a whole number.  Only a numerator is
     * supplied and the denominator is defaulted to 1.
     *
     * @param numerator The numerator of the fraction
     */
    public Fraction( int numerator )
    {
        // Default to a denominator of 1
        this( numerator, 1 );
    }
    
    /**
     * Builds this Fraction object using the specified numerator and denominator
     *
     * @param numerator The numerator of the fraction
     * @param denominator The denominator of the fraction
     */
    public Fraction( int numerator, int denominator )
    {
        _numerator = numerator;
        _denominator = denominator;
    }
    
    /**
     * Evaluates this fraction and returns the result
     *
     * @return The result of evaluating this Fraction
     */
    public float evaluate()
    {
        return ((float) _numerator) / ((float) _denominator);
    }
    
    /**
     * Returns the greatest common divisor of the numerator and denominator
     * of this fraction
     *
     * @return The greatest-common divisor
     */
    public int getGCD()
    {
        return findGCD( _numerator, _denominator );
    }
    
    /**
     * Returns the string representation of this fraction
     *
     * @return The string representation
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        // Get the GCD
        int gcd = getGCD();
        
        // Simplify the numerator and denominator
        int numerator = _numerator / gcd;
        int denominator = _denominator / gcd;
        
        // Build the string representation
        return numerator + "/" + denominator; 
    }

    /**
     * A recursive method that calculates the greatest common divisor
     *
     * @param a First value
     * @param b Second value
     * @return The greatest common divisor
     */
    private int findGCD( int a, int b )
    {
        int result = 0;
        
        // Is one of the values 0?
        if( (0 == a) || (0 == b) )
        {
            // Yup, use the other value
            result = (a + b);
        }
        else
        {
            // Nope, keep going
            result = findGCD( b, (a % b) );
        }
        
        return result;
    }
}
