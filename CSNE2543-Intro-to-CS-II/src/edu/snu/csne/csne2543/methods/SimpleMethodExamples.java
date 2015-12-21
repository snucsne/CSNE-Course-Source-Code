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
package edu.snu.csne.csne2543.methods;

/**
 * @author Brent Eskridge
 */
public class SimpleMethodExamples
{
    public static void main( String[] args )
    {
        // Call our methods
        doSomething();
        int result = doSomethingElse();
        doSomethingElse();
        doSomethingCompletelyDifferent( 55, 3.14159f );
        doSomethingComplicated( -13 );
    }
    
    // Signature: doSomething()
    public static void doSomething()
    {
        System.out.println( "Doing something..." );
    }
    
    // Signature: doSomethingElse()
    public static int doSomethingElse()
    {
        System.out.println( "Doing something else..." );
        
        return 42;
    }
    
    // Signature: doSomethingCompletelyDifferent( int, float )
    public static void doSomethingCompletelyDifferent(
            int integerValue,
            float floatValue )
    {
        System.out.println( "Completely different with ["
                + integerValue
                + "] and ["
                + floatValue
                + "]" );
    }
    
    // Signature: doSomethingComplicated( int )
    public static void doSomethingComplicated( int parameter )
    {
        // If I need debugging code, where do I put it?
        if( 0 > parameter )
        {
            System.out.println( "Less than zero..." );
            
//            return;
        }
        else if( 0 < parameter )
        {
            System.out.println( "Greater than zero..." );
            
//            return;
        }
        else
        {
            System.out.println( "Equal to zero..." );
            
//            return;
        }
        
        return;
    }
    
    // Signature bailOutMethod( boolean )
    public static void bailOutMethod( boolean flag )
    {
        // Test something to see if we can proceed
        if( flag )
        {
            // Bail out now
            return;
        }
        
        // Do something long and complicated
    }
}
