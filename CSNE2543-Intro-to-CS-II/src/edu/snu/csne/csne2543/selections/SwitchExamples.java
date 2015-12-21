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
public class SwitchExamples
{
    public static void main( String[] args )
    {
        int value = 3;
        
        switch( value )
        {
        case 0:
            System.out.println( "case 0" );
            break;
        case 1:
            System.out.println( "case 1" );
            break;
        case 2:
            System.out.println( "case 2" );
            break;
        case 3:
            System.out.println( "case 3" );
        case 4:
            System.out.println( "case 4" );
            break;
        default:
            System.out.println( "default" );
        }
        
        int dayOfTheWeek = 42;
        switch( dayOfTheWeek )
        {
        case 0:
        case 6:
            System.out.println( "Weekend!" );
            break;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            System.out.println( "Workday :(" );
            break;
        default:
            System.out.println( "Unknown" );
        }
    }

}
