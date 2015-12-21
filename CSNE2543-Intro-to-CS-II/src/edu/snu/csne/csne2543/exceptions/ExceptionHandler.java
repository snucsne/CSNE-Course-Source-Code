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
package edu.snu.csne.csne2543.exceptions;

import java.io.IOException;

/**
 * Simple class demonstrating different exception handling
 *
 * @author Brent Eskridge
 */
public class ExceptionHandler
{
    // Throw and catch an exception in a method
    public void doSomething()
    {
        try
        {
            throw new Exception( "Oops, but I can handle it!" );
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
    
    // Throw an exception, but don't catch it
    public void doSomethingElse() throws Exception
    {
        throw new Exception( "Oops!  I don't know what to do!" );
    }
    
    // Rethrow a wrapped, or chained, exception
    public void doSomethingCompletelyDifferent() throws Exception
    {
        try
        {
            throw new IOException( "IO oops!" );
        }
        catch( IOException ioe )
        {
            throw new Exception( "Got an IOException", ioe );
        }
    }
    
    // Throw a runtime exception
    public void doSomethingSneaky()
    {
        throw new RuntimeException( "Surprise!" );
    }
    
    public static void main( String[] args )
    {
        // Do something that handles its own exception
        ExceptionHandler handler = new ExceptionHandler();
        handler.doSomething();
        
        // Do something that doesn't handle its own exception
        try
        {
            handler.doSomethingElse();
        }
        catch( Exception e )
        {
            System.err.println( "Did something bad" );
            e.printStackTrace();
        }
        
        /* Do something that wraps a detailed exception
         * with a generic one. */
        try
        {
            handler.doSomethingCompletelyDifferent();
        }
        catch( Exception e )
        {
            System.err.println( "Did something vaguely bad..." );
            e.printStackTrace();
        }
        finally
        {
            System.out.println( "Always execute a finally clause!" );
        }
        
        // Do something that generates a runtime exception
        handler.doSomethingSneaky();
        
        System.out.println( "All done!" );
    }
}
