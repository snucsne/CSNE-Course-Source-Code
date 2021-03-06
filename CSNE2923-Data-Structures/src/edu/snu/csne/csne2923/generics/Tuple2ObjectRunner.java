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
package edu.snu.csne.csne2923.generics;

/**
 * A simple class to demonstrate usage of the generic Tuple2Object class
 *
 * @author Brent Eskridge
 */
public class Tuple2ObjectRunner
{
    /**
     * The main entry point of the application
     *
     * @param args Command line arguments
     */
    public static void main( String[] args )
    {
        // Create a tuple for floats
        Tuple2Object floatTuple = new Tuple2Object(
                new Float( 42.0f ),
                new Float( 55.0f ) );
        
        // Use it
        System.out.println( "Float first value before change ["
                + floatTuple.getFirst()
                + "]" );
        floatTuple.setFirst( new Float( 13.0f ) );
        System.out.println( "Float first value after change ["
                + floatTuple.getFirst()
                + "]" );

        // Create a tuple for Strings
        Tuple2Object stringTuple = new Tuple2Object(
                "Bob",
                "Sally" );

        // Use it
        System.out.println( "String first value before change ["
                + stringTuple.getFirst()
                + "]" );
        stringTuple.setFirst( "George" );
        System.out.println( "String first value after change ["
                + stringTuple.getFirst()
                + "]" );

        // We must cast the Object back to the right type
        String first = (String) stringTuple.getFirst();

        // No type safety!
        stringTuple.setFirst( new Float( 77.0f ) );
        System.out.println( "String first value after INVALID change ["
                + stringTuple.getFirst()
                + "]" );
    }

}
