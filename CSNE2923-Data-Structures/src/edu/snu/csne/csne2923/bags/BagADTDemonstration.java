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
package edu.snu.csne.csne2923.bags;

/**
 * A simple class to demonstrate usage of the BagADT class
 *
 * @author Brent Eskridge
 */
public class BagADTDemonstration
{
    /**
     * The main entry point of the application
     *
     * @param args Command line arguments
     */
    public static void main( String[] args )
    {
        // Create a bag for strings
        BagADT<String> stringBag = new ConcreteBagADT<String>();
        
        // Add some strings
        boolean result = stringBag.add( "Bob" );
        System.out.println( "Succes for adding Bob [" + result + "]" );
        result = stringBag.add( "Sally" );
        System.out.println( "Succes for adding Sally [" + result + "]" );
        result = stringBag.add( "Billy" );
        System.out.println( "Succes for adding Billy [" + result + "]" );
        
        // The size of the bag
        System.out.println( "Bag size=["
                + stringBag.size()
                + "]" );
        
        // Remove an item
        String removed = stringBag.remove( "Billy" );
        System.out.println( "Removed 'Billy' result=[" + removed + "]" );
        System.out.println( "New size=[" + stringBag.size() + "]" );
    }
}
