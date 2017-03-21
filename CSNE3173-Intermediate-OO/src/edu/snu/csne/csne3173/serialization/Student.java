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
package edu.snu.csne.csne3173.serialization;

//Imports
import java.io.Serializable;

/**
 * Class defining a serializable student
 *
 * @author Brent Eskridge
 */
public class Student implements Serializable
{
    /** Default serial version UID */
    private static final long serialVersionUID = 1L;
    
    protected String _name = null;
    protected String _id   = null;
    protected float  _gpa  = 0.0f;

    public Student( String name, String id, float gpa )
    {
        _name = name;
        _id = id;
        _gpa = gpa;

        System.out.println( "Student ["
                + _id
                + "] built" );
    }

    public String getName()
    {
        return _name;
    }

    public String getID()
    {
        return _id;
    }

    public float getGPA()
    {
        return _gpa;
    }

    public String toString()
    {
        StringBuilder builder = new StringBuilder(
                this.getClass().getName() );
        builder.append( ": name=[" );
        builder.append( _name );
        builder.append( "] id=[" );
        builder.append( _id );
        builder.append( "] gpa=[" );
        builder.append( String.format( "%4.2f", _gpa ) );
        builder.append( "]" );

        return builder.toString();
    }
}
