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
package edu.snu.csne.csne2543.thinkingobjects;

/**
 * A generic event class
 *
 * @author Brent Eskridge
 */
public class Event
{
    /** The description of this event */
    private String _description = null;
    
    /** The timestamp of this event */
    private long _timestamp = 0l;

    /**
     * Builds this Event object
     *
     * @param description This event's description
     * @param timestamp This event's timestamp
     */
    public Event( String description, long timestamp )
    {
        // Validate the parameters
        // TODO
        
        // Store them
        _description = description;
        _timestamp = timestamp;
    }
    
    /**
     * Returns the description of this event
     *
     * @return This event's description
     */
    public String getDescription()
    {
        return _description;
    }
    
    /**
     * Returns the timestamp of this event
     *
     * @return This event's timestamp
     */
    public long getTimestamp()
    {
        return _timestamp;
    }
}
