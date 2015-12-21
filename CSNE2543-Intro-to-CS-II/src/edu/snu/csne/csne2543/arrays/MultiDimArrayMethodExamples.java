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
public class MultiDimArrayMethodExamples
{
    public static void main( String[] args )
    {
        int[][] daysInMonth = {
                { 31, 28, 31, 30,
                  31, 30, 31, 31,
                  30, 31, 30, 31 },
                { 31, 28, 31, 30,
                  31, 30, 31, 31,
                  30, 31, 30, 31 },
                { 31, 28, 31, 30,
                  31, 30, 31, 31,
                  30, 31, 30, 31 },
                { 31, 28, 31, 30,
                  31, 30, 31, 31,
                  30, 31, 30, 31 } };
        
        System.out.println( "Before: February[1]=["
                + daysInMonth[1][1]
                + "]" );
        
        // Call the method
        makeLeapYear( daysInMonth );
        
        System.out.println( "After: February[1]=["
                + daysInMonth[1][1]
                + "]" );
        
        // Methods can return arrays too
        String[][] names = buildNames();
        System.out.println( "Length of names ["
                + names.length
                + "]" );
    }
    
    public static void makeLeapYear( int[][] daysInMonth )
    {
        daysInMonth[1][1] = 29;
    }
    
    public static String[][] buildNames()
    {
        String[][] someNames = {
                {"Bob",
                 "Sally",
                 "George" },
                {"Reginald",
                 "Ian",
                 "Matilda"} };
        return someNames;
    }

}
