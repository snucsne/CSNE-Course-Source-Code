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
package edu.snu.csne.csne2923.generics;

/**
 * A simple class for containing a 2-tuple of floats
 *
 * @author Brent Eskridge
 */
public class Tuple2f
{
    /** First tuple value */
    private float _first = 0.0f;
    
    /** Second tuple value */
    private float _second = 0.0f;
    
    
    /**
     * Builds this tuple using the specified values
     *
     * @param first The first value
     * @param second The second value
     */
    public Tuple2f( float first, float second )
    {
        _first = first;
        _second = second;
    }
    
    /**
     * Changes the first value to the specified value
     *
     * @param first The first value
     */
    public void setFirst( float first )
    {
        _first = first;
    }
    
    /**
     * Returns the first value in this tuple
     *
     * @return The first value
     */
    public float getFirst()
    {
        return _first;
    }
    
    /**
     * Changes the second value to the specified value
     *
     * @param second The second value
     */
    public void setSecond( float second )
    {
        _second = second;
    }
    
    /**
     * Returns the second value in this tuple
     *
     * @return The second value
     */
    public float getSecond()
    {
        return _second;
    }
}
