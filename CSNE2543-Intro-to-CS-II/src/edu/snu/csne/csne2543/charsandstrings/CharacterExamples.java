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

/**
 * @author Brent Eskridge
 */
public class CharacterExamples
{
    public static void main( String[] args )
    {
        // Sample char variables
        char letterA = 'A';
        char letterB = 'B';
        char letterLowerA = 'a';
        char letterLowerB = 'b';
        char number = '4';
        char tab = '\t';
        
        // Numeric operators
        System.out.println( "letterA=["
                + letterA
                + "]" );
        System.out.println( "letterA+1=["
                + (letterA+1)
                + "]" );
        System.out.println( "letterA+1=["
                + (char) (letterA + 1)
                + "]" );
        System.out.println( "letterA*2=["
                + (char) (letterA * 2)
                + "]" );

        // Relational operators
        System.out.println( "A < B =["
                + (letterA < letterB)
                + "]" );
        System.out.println( "B < a =["
                + (letterB < letterLowerA)
                + "]" );
        
        // Character methods
        System.out.println( "isLetter(letterA)=["
                + Character.isLetter( letterA )
                + "]" );
        System.out.println( "isLowerCase(letterA)=["
                + Character.isLowerCase( letterA )
                + "]" );
        System.out.println( "isDigit(number)=["
                + Character.isDigit( number )
                + "]" );
    }
}
