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
package edu.snu.csne.csne2543.arrays;

import java.util.Arrays;

/**
 * @author Brent Eskridge
 */
public class ArrayCopyExample
{
    public static void main( String[] args )
    {
        // This doesn't copy the contents.
        int[] firstArray = { 1, 2, 3, 4 };
        int[] secondArray = firstArray;
        
        /* Notice that if we change a value in the
         * second array, the first array changes too. */
        secondArray[1] = 55;
        System.out.println( "firstArray[1]=["
                + firstArray[1]
                + "]" );
        
        // There are two ways to copy the array
        // The first uses a for-loop
        int[] copyOfFirstArray = new int[ firstArray.length ];
        for( int i = 0; i < copyOfFirstArray.length; i++ )
        {
            copyOfFirstArray[i] = firstArray[i];
        }
        // The second uses the System class
        System.arraycopy( firstArray, // Source
                0, // Source starting index
                copyOfFirstArray, // Destination
                0, // Dest starting index
                firstArray.length ); // Number to copy
        
        /* Can also use the Arrays class if you want to
         * create a new array. */
        int[] newArrayCopy = Arrays.copyOf( firstArray,
                firstArray.length );
    }
}
