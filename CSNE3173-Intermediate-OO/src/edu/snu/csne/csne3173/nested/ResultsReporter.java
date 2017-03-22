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
 */package edu.snu.csne.csne3173.nested;

 // Imports
import java.util.LinkedList;
import java.util.List;


/**
 * A simple example of a non-static nested class, or inner class
 *
 * @author Brent Eskridge
 */
public class ResultsReporter
{
    /**
     * A private, inner class that simply contains all the necessary details
     * about a result.  It isn't used anywhere else in code, so it doesn't
     * need to be public.  My making it a private, inner class, we hide details
     * regarding this class'es implementation.
     *
     * @author Brent Eskridge
     */
    private class Result
    {
        private long _timestamp = 0;
        private String _description = null;
        private int _value = 0;
        
        private Result( long timestamp, String description, int value )
        {
            _timestamp = timestamp;
            _description = description;
            _value = value;
        }
    }
    
    /** A list containing a history of all the results */
    private List<Result> _resultHistory = new LinkedList<ResultsReporter.Result>();
    
    /**
     * Records the result of some event
     *
     * @param description A description of the event
     * @param value A value resulting from the event
     */
    public void recordResult( String description, int value )
    {
        _resultHistory.add( new Result( System.currentTimeMillis(),
                description,
                value ) );
    }
    
    /**
     * Generates the report of all the results
     *
     * @return The report as a string
     */
    public String generateReport()
    {
        StringBuilder builder = new StringBuilder();
        for( Result result : _resultHistory )
        {
            /* Note that since even though the inner class is private and the
             * attributes are private, the enclosing class has access to them */
            builder.append( result._timestamp );
            builder.append( ": " );
            builder.append( result._description );
            builder.append( " - result=[" );
            builder.append( result._value );
            builder.append( "]" );
        }
        
        return builder.toString();
    }
}
