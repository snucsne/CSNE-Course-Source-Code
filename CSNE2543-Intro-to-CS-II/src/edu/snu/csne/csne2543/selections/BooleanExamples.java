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
package edu.snu.csne.csne2543.selections;

/**
 * TODO Class description
 *
 * @author Brent Eskridge
 */
public class BooleanExamples
{
    public static void main( String[] args )
    {
        int i = 3;
        int j = 4;
        
        // Boolean expressions and variables
        boolean success = true;
        boolean lessThan = (i < j);
        boolean lessThanOrEqual = (i <= j);
        boolean greaterThan = (i > j);
        boolean greaterThanOrEqual = (i >= j);
        boolean equal = (i == j);
        boolean notEqual = (i != j);
        
        System.out.println( "success=[" + success + "]" );
        System.out.println( "lessThan=[" + lessThan + "]" );
        System.out.println( "lessThanOrEqual=[" + lessThanOrEqual + "]" );
        System.out.println( "greaterThan=[" + greaterThan + "]" );
        System.out.println( "greaterThanOrEqual=[" + greaterThanOrEqual + "]" );
        System.out.println( "equal=[" + equal + "]" );
        System.out.println( "notEqual=[" + notEqual + "]" );
        
        
        int k = 5;
        
        boolean valid = (4 == i) && (5 == k);
        System.out.println( "valid=[" + valid + "]" );
        
        valid = (4 == i) || (5 == k);
        System.out.println( "valid=[" + valid + "]" );
        
    }

}
