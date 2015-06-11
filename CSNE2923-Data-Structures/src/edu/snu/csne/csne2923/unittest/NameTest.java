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

// Imports
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test class to test the Name class
 *
 * @author Brent Eskridge
 */
public class NameTest
{
    /* Strings for testing created here so we don't have typos */
    private static String _johnDoeFirstName = "John";
    private static String _johnDoeLastName = "Doe";
    private static String _sallyMaeFirstName = "Sally";
    private static String _sallyMaeLastName = "Mae";
    
    /** Basic John Doe name */
    private Name _johnDoe = null;
    
    /** Basic Sally Mae name */
    private Name _sallyMae = null;
    
    /**
     * Initializes the basic names for testing
     *
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception
    {
        // Initialize the basic names
        _johnDoe = new Name( _johnDoeFirstName, _johnDoeLastName );
        _sallyMae = new Name( _sallyMaeFirstName, _sallyMaeLastName );
    }

    /**
     * Test method for {@link edu.snu.csne.csne2923.unittest.Name#setName(java.lang.String, java.lang.String)}.
     */
    @Test
    public void testSetName()
    {
        // Give John Doe a new name
        String newFirstName = "Bob";
        String newLastName = "Smith";
        _johnDoe.setName( newFirstName, newLastName );
        assertEquals( "Bob Smith's new first name is incorrect",
                _johnDoe.getFirst(),
                newFirstName );
        assertEquals( "Bob Smith's new last name is incorrect",
                _johnDoe.getLast(),
                newLastName );
    }

    /**
     * Test method for {@link edu.snu.csne.csne2923.unittest.Name#getName()}.
     */
    @Test
    public void testGetName()
    {
        assertEquals( "John Doe's full name is incorrect",
                _johnDoe.getName(),
                _johnDoeFirstName + " " + _johnDoeLastName );
        assertEquals( "Sally Mae's full name is incorrect",
                _sallyMae.getName(),
                _sallyMaeFirstName + " " + _sallyMaeLastName );
    }

    /**
     * Test method for {@link edu.snu.csne.csne2923.unittest.Name#setFirst(java.lang.String)}.
     */
    @Test
    public void testSetFirst()
    {
        // Change John Doe's first name to Bob
        String newFirstName = "Bob";
        _johnDoe.setFirst( newFirstName );
        assertEquals( "Bob Doe's new first name is incorrect",
                _johnDoe.getFirst(),
                newFirstName );
    }

    /**
     * Test method for {@link edu.snu.csne.csne2923.unittest.Name#getFirst()}.
     */
    @Test
    public void testGetFirst()
    {
        // Check the first names of each of the test names
        assertEquals( "John Doe's first name is incorrect",
                _johnDoe.getFirst(),
                _johnDoeFirstName );
        assertEquals( "Sally Mae's first name is incorrect",
                _sallyMae.getFirst(),
                _sallyMaeFirstName );
    }

    /**
     * Test method for {@link edu.snu.csne.csne2923.unittest.Name#setLast(java.lang.String)}.
     */
    @Test
    public void testSetLast()
    {
        // Change John Doe's last name to Smith
        String newLastName = "Smith";
        _johnDoe.setLast( newLastName );
        assertEquals( "Jon Smith's new last name is incorrect",
                _johnDoe.getLast(),
                newLastName );
    }

    /**
     * Test method for {@link edu.snu.csne.csne2923.unittest.Name#getLast()}.
     */
    @Test
    public void testGetLast()
    {
        // Check the last names of each of the test names
        assertEquals( "John Doe's last name is incorrect",
                _johnDoe.getLast(),
                _johnDoeLastName );
        assertEquals( "Sally Mae's last name is incorrect",
                _sallyMae.getLast(),
                _sallyMaeLastName );
    }

    /**
     * Test method for {@link edu.snu.csne.csne2923.unittest.Name#giveLastNameTo(edu.snu.csne.csne2923.unittest.Name)}.
     */
    @Test
    public void testGiveLastNameTo()
    {
        // Have John give Sally his last name
        _johnDoe.giveLastNameTo( _sallyMae );
        
        // Check that Sally's name is the same as John's
        assertEquals( "Sally Doe's new last name is incorrect",
                _sallyMae.getLast(),
                _johnDoeLastName );
    }
}
