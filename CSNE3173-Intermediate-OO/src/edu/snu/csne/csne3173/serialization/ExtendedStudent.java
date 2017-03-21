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

// Imports
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

/**
 * Class defining a serializable student that has been extended to include
 * a password.
 *
 * @author Brent Eskridge
 */
public class ExtendedStudent extends Student
{
    /** Default serial version UID */
    private static final long serialVersionUID = 1L;
    
    transient protected String _password = null;

    public ExtendedStudent( String name,
            String id,
            float gpa,
            String password )
    {
        super( name, id, gpa );

        _password = password;

        System.out.println( "ExtendedStudent ["
                + _id
                + "] built" );
    }

    public String getPassword()
    {
        return _password;
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
        builder.append( "] password=[" );
        builder.append( _password );
        builder.append( "]" );

        return builder.toString();
    }

    private void writeObject( ObjectOutputStream out )
            throws IOException
    {
      out.defaultWriteObject();
    }

    private void readObject( ObjectInputStream in )
            throws IOException, ClassNotFoundException
    {
        in.defaultReadObject();

        // Read the password from the database
        _password = "pass1234";
    }
}
