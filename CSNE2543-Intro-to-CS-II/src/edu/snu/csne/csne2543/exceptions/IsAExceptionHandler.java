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

/**
 * Simple class demonstrating inheritance w.r.t. exceptions
 *
 * @author Brent Eskridge
 */
public class IsAExceptionHandler
{
    private static boolean _throwA = false;
    
    public static void main( String[] args )
    {
        try
        {
            gitRDone();
        }
        catch( TypeAException tae )
        {
            System.err.println( "Caught: Type A" );
        }
        catch( TypeBException tae )
        {
            System.err.println( "Caught: Type B" );
        }
        catch( Exception e )
        {
            System.err.println( "Caught: Generic exception" );
        }
    }
    
    public static void gitRDone() throws TypeAException, TypeBException
    {
        if( _throwA )
        {
            throw new TypeAException( "Type A" );
        }
        else
        {
            throw new TypeBException( "Type B" );
        }
    }
}
