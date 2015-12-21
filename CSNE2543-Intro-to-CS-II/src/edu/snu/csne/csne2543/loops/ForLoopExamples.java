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
package edu.snu.csne.csne2543.loops;

/**
 * @author Brent Eskridge
 */
public class ForLoopExamples
{
    public static void main( String[] args )
    {
        // Basic for loop
        int max = 5;
        System.out.println( "Basic for loop..." );
        for( int i = 0; i < max; i++ )
        {
            System.out.println( "i=[" + i + "]" );
        }
        System.out.println( "Done!" );
        
        // Note that i doesn't exist outside the loop
//        i = 5;
        
        // For loop with a decrementing value
        System.out.println( "Countdown..." );
        for( int i = max; 0 <= i; i-- )
        {
            System.out.println( "i=[" + i + "]" );
        }
        System.out.println( "Blastoff!" );
        
        // Multiplying index by 2
        System.out.println( "Doubling..." );
        for( int i = 1; i < max; i *= 2 )
        {
            System.out.println( "i=[" + i + "]" );
        }
        System.out.println( "Done!" );
        
        // Multiple variables
        System.out.println( "Multiple valiables..." );
        for( int i = 0, j = 10; i < j; i++, j-- )
        {
            System.out.println( "i=[" + i + "] j=[" + j + "]" );
        }
        
        // Nested loops
        // Note:  When nesting loops, it is a common programming idiom
        //        to use index variables i, j, and k
        System.out.println( "Nested loops..." );
        for( int i = 0; i < 3; i++ )
        {
            for( int j = 0; j < 3; j++ )
            {
                System.out.println( "i=[" + i + "] j=[" + j + "]" );
            }
        }
    }
}
