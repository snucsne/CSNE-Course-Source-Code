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
 * Abstract Ball base class
 *
 * @author Brent Eskridge
 */
public abstract class Ball
{
    /** Size of the ball */
    private float _size = 0.0f;
   
    /**
     * Builds this Ball object
     */
    protected Ball()
    {
        // Do nothing
    }
    
    /**
     * Abstract method for playing with the ball
     */
    public abstract void play();
//    {
//        System.out.println( "Testing: 1, 2, 4..." );
//    }
    
    /**
     * Roll this ball
     */
    public void roll()
    {
        System.out.println( "Rolling, rolling, rolling..." );
    }

    /**
     * Bounce this ball
     */
    public void bounce()
    {
        System.out.println( "Bouncy!" );
    }

}
