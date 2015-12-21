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
package edu.snu.csne.csne2543.abstractclasses;

/**
 * Sample class to demonstrate Comparable
 *
 * @author Brent Eskridge
 */
public class Student implements Comparable<Student>
{
    /** This student's first name */
    private String _firstName = null;
    
    /** This student's last name */
    private String _lastName = null;

    public Student( String firstName, String lastName )
    {
        _firstName = firstName;
        _lastName = lastName;
    }
    
    public int compareTo( Student other )
    {
        int result = 0;
        
        // First compare the last name
        result = _lastName.compareTo( other._lastName );
        
        // If they are the same, use the first name
        if( 0 == result )
        {
            result = _firstName.compareTo( other._firstName );
        }
        
        return result;
    }
    
    @Override
    public String toString()
    {
        return _lastName + ", " + _firstName;
    }

    public static void main( String[] args )
    {
        Student george = new Student( "George", "Smith" );
        Student sarah = new Student( "Sarah", "Smith" );
        Student joe = new Student( "Joe", "Bob" );
        
        System.out.println( "("
                + george
                + ").compareTo("
                + joe
                + ") = ["
                + george.compareTo( joe )
                + "]" );
        System.out.println( "("
                + george
                + ").compareTo("
                + sarah
                + ") = ["
                + george.compareTo( sarah )
                + "]" );
    }
}
