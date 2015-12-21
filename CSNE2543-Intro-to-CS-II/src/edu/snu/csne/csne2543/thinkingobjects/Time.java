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
 * A class representing a given time
 *
 * @author Brent Eskridge
 */
public class Time
{
    /** Seconds component of the time */
    public int seconds = 0;
    
    /** Minutes component of the time */
    public int minutes = 0;
    
    /** Hours component of the time */
    public int hours = 0;
    
    /**
     * Sets the seconds component of this Time object
     *
     * @param seconds The new seconds value
     */
    public void setSeconds( int seconds )
    {
        this.seconds = seconds;
    }
    
    /**
     * Returns the seconds component of this Time object
     *
     * @return The seconds component
     */
    public int getSeconds()
    {
        return seconds;
    }
    
    /* Add additional accessor & mutator methods */
}
