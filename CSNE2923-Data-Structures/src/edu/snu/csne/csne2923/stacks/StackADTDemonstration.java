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
package edu.snu.csne.csne2923.stacks;

/**
 * A simple class to demonstrate usage of the StackADT class
 *
 * @author Brent Eskridge
 */
public class StackADTDemonstration
{

    /**
     * The main entry point of the application
     *
     * @param args Command line arguments
     */
    public static void main( String[] args )
    {
        // Create a StackADT for testing
        StackADT<String> stack = new VectorStackADT<String>();
        
        // Push some strings
        stack.push( "A" );
        stack.push( "B" );
        stack.push( "C" );
        
        // Display the current state
        System.out.println( stack.toFormattedString() );
        
        // Pop the top
        String popped = stack.pop();
        System.out.println( "Popped=[" + popped + "]" );
        
        // Push another string
        stack.push( "D" );
        
        // Peek and push
        stack.push( stack.peek() );

        // Display the current state
        System.out.println( stack.toFormattedString() );
        
        // Pop the top
        popped = stack.pop();
        System.out.println( "Popped=[" + popped + "]" );

        // Push another string
        stack.push( "E" );

        // Display the current state
        System.out.println( stack.toFormattedString() );
    }

}
