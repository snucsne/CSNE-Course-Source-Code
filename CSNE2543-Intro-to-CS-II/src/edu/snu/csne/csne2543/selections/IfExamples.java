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
public class IfExamples
{
    public static void main( String[] args )
    {
        boolean success = true;
        boolean valid = true;
        
        if( success )
        {
            System.out.println("Inside the IF");
            System.out.println( "Also in the IF" );
            
            if( valid )
            {
                System.out.println( "Valid and success" );
            }
        }
        else
        {
            System.out.println( "Inside the else" );
        }
        
        System.out.println( "Done" );
        
        int i = 4;
        int j = 3;
        
        if( i < j )
        {
            System.out.println( "i < j" );
        }
        else if( i > j )
        {
            System.out.println( "i > j" );
        }
        else
        {
            System.out.println( "equal" );
        }
        
        boolean value = false;
        if( i < j )
        {
            value = true;
        }
        
        value = (i < j);
        
        int k = 0;
        if( i < j )
        {
            k = 1;
        }
        else
        {
            k = -1;
        }
        
        k = (i < j) ? 1 : -1;
    }
}
