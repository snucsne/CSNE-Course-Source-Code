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
package edu.snu.csne.csne3173.nested;

import java.util.Iterator;

/**
 * StackADT
 *
 * This interface describes the client interface to a stack abstract
 * data type.
 *
 * @author Brent Eskridge
 */
public interface StackADT<T>
{
    /**
     * Adds a new entry to the top of this stack.
     *
     * @param entry The entry to be added to the top of this stack
     */
    public void push( T entry );

    /**
     * Removes and returns the entry at the top of the stack.
     *
     * @return Returns the entry at the top of the stack if the stack
     *         is not empty, otherwise, <code>null</code>
     */
    public T pop();

    /**
     * Retrieves the entry at the top of the stack.
     *
     * @return Returns the entry at the top of the stack if the stack
     *         is not empty, otherwise, <code>null</code>
     */
     public T peek();

    /**
     * Determines if the stack is empty.
     *
     * @return Returns <code>true</code> if the stack is empty,
     *         otherwise, <code>false</code>
     */
    public boolean isEmpty();

    /**
     * Removes all entries from the stack.
     */
    public void clear();

    /**
     * Returns a formatted description of this stack.  The description
     * contains all of the entries in the stack in first to last order.
     *
     * @return A formatted description of this stack
     */
    public String toFormattedString();

    
    public Iterator<T> iterator();
}
