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
package edu.snu.csne.csne2543.charsandstrings;

import java.util.Scanner;

/**
 * TODO Class description
 *
 * @author Brent Eskridge
 */
public class StringExamples
{
    public static void main( String[] args )
    {
        // String creation
        String literal1 = "By your command";
        String literal2 = "By your command";
        String combined1 = "Hello" + " " + "world!";
        String combined2 = "The answer is " + 42;
        String combined3 = "By" + " your " + "command";
        
        System.out.println( combined2 );
        
        // String methods
        System.out.println( "length=["
                + literal1.length()
                + "]" );
        System.out.println( "charAt(1)=[" 
                + literal1.charAt( 1 )
                + "]" );
        System.out.println( "contains( \"z\" )=["
                + literal1.contains( "z" )
                + "]" );
        
        // String comparison
        System.out.println( "lit1.equals( lit2 )=["
                + literal1.equals( literal2 )
                + "]" );
        System.out.println( "lit1.equals( comb1 )=["
                + literal1.equals( combined1 )
                + "]" );
        System.out.println( "lit1.equals( comb3 )=["
                + literal1.equals( combined3 )
                + "]" );
        
        // Scanners can be used to get input
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Enter a string: " );
        String input = scanner.nextLine();
        System.out.println( "input=[" + input + "]" );
        
        // Don't compare strings like this!
        System.out.println( "(lit1 == input)=["
                + ( literal1 == input )
                + "]" );
        System.out.println( "(lit1 == comb3) =["
                + (literal1 == combined3)
                + "]" );
        
        // Convert strings to primitive datatypes
        String intString = "55";
        int intValue = Integer.valueOf( intString );
        intString = Integer.toString( intValue );
    }
}
