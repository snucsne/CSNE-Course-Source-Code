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
import java.io.ObjectInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Test class for reading student objects
 *
 * @author Brent Eskridge
 */
public class StudentReadTest
{
    public static void main( String[] args )
    {
        String filename = "student.sav";

        Student student = null;

        ObjectInputStream in = null;
        try
        {
            File file = new File( filename );
            in = new ObjectInputStream(
                    new FileInputStream( file ) );
            student = (Student) in.readObject();
            in.close();
        }
        catch( IOException ioe )
        {
            ioe.printStackTrace();
        }
        catch( ClassNotFoundException cnfe )
        {
            cnfe.printStackTrace();
        }

        if( null != student )
        {
            System.out.println( "Loaded student: " + student );
        }
    }
}
