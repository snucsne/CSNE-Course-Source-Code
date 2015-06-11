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
package edu.snu.csne.csne2923.unittest;

/**
 * A simple class representing a person's name Adapted from Carrano and Henry
 * "Data Structures and Abstractions with Java" 4th Edition
 * 
 * @author Brent Eskridge
 */
public class Name
{
    /** The person's first name */
    private String _first = null;

    /** The person's last name */
    private String _last = null;

    /**
     * Default constructor
     */
    public Name()
    {
        // Do nothing
        /* Useful here for demonstration purposes, but would otherwise be an
         * inappropriate constructor as the class is in an invalid state once
         * it completes.  To make it valid, we could initialize the name
         * to a default such as "John Doe". */
    }

    /**
     * Construct's a name given a first and last name
     *
     * @param first The person's first name
     * @param last The person's last name
     */
    public Name( String first, String last )
    {
        _first = first;
        _last = last;
    }

    /**
     * Changes this person's first and last name
     *
     * @param first The person's first name
     * @param last The person's last name
     */
    public void setName( String first, String last )
    {
        setFirst( first );
        setLast( last );
    }

    /**
     * Returns a string representation of this name
     *
     * @return A string representation of this name
     */
    public String getName()
    {
        return toString();
    }

    /**
     * Changes this person's first name to the specified name
     *
     * @param first The person's first name
     */
    public void setFirst( String first )
    {
        _first = first;
    }

    /**
     * Returns this person's first name
     *
     * @return The person's first name
     */
    public String getFirst()
    {
        return _first;
    }

    /**
     * Changes this person's last name to the specified name
     *
     * @param last The person's last name
     */
    public void setLast( String last )
    {
        _last = last;
    }

    /**
     * Returns this person's last name
     *
     * @return The person's last name
     */
    public String getLast()
    {
        return _last;
    }

    /**
     * Changes the last name of the specified person's name to match this name
     *
     * @param name The other person's name
     */
    public void giveLastNameTo( Name name )
    {
        name.setLast( _last );
    }

    /**
     * Returns a string representation of this name
     *
     * @return A string representation of this name
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return _first + " " + _last;
    }
}
