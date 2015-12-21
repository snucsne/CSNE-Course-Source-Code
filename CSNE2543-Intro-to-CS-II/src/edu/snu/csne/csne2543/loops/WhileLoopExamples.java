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
public class WhileLoopExamples
{
    public static void main( String[] args )
    {
        // Counter-controlled loop
        int counter = 5;
        while( 0 <= counter )
        {
            // Do something interesting
            System.out.println( "Count=[" + counter + "]" );
            
            // Decrement the counter
            --counter;
        }
        System.out.println( "Blastoff!" );
        
        // Sentinel-controlled loop
        boolean done = false;
        while( !done )
        {
            // Do something interesting
            System.out.println( "Working..." );
            
            // Update the sentinel in some way
            done = Math.random() > 0.75;
        }
        System.out.println( "Done" );
        
//        // Oops!  An infinite loop
//        counter = 5;
//        while( 0 <= counter )
//        {
//            // Do something interesting
//            System.out.println( "Count=[" + counter + "]" );
//            
//            // Forget to decrement the counter
//        }
        
        // There is no guarantee that a while loop will execute
        System.out.println( "Seeing if the loop will execute..." );
        done = true;
        while( !done )
        {
            System.out.println( "Not done..." );
        }
        System.out.println( "Done" );
    }
}
