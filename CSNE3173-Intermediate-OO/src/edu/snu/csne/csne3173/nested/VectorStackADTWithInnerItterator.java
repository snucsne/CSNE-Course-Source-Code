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

// Imports
import java.util.Iterator;
import java.util.Vector;


/**
 * VectorStackADTWithInnerItterator
 *
 * This class provides an adapter implementation of the StackADT interface.
 * This class uses an inner class to implement an iterator
 *
 * @author Brent Eskridge
 */
public class VectorStackADTWithInnerItterator<T> implements StackADT<T>
{
    /** Vector that is adapted */
    private Vector<T> _vector = new Vector<T>();

    /**
     * A private inner-class implementation of the iterator for the stack.
     * Note that it can access the private attributes of the outer class
     *
     * @author Brent Eskridge
     */
    private class VectorStackIterator implements Iterator<T>
    {
        /** The current index of the iterator */
        private int _idx = 0;

        @Override
        public boolean hasNext()
        {
            return _idx < _vector.size();
        }

        @Override
        public T next()
        {
            return _vector.get( _idx++ );
        }
        
    }
    
    /**
     * Builds this VectorStackADTWithInnerItterator object
     *
     */
    public VectorStackADTWithInnerItterator()
    {
        // Do nothing
    }

    /**
     * Adds a new entry to the top of this stack.
     *
     * @param entry The entry to be added to the top of this stack
     * @see edu.snu.csne.csne2923.stacks.StackADT#push(java.lang.Object)
     */
    
    public void push( T entry )
    {
        _vector.add( 0, entry );
    }

    /**
     * Removes and returns the entry at the top of the stack.
     *
     * @return Returns the entry at the top of the stack if the stack
     *         is not empty, otherwise, <code>null</code>
     * @see edu.snu.csne.csne2923.stacks.StackADT#pop()
     */
    public T pop()
    {
        T popped = null;
        if( !_vector.isEmpty() )
        {
            popped = _vector.remove( 0 );
        }
        return popped;
    }

    /**
     * Retrieves the entry at the top of the stack.
     *
     * @return Returns the entry at the top of the stack if the stack
     *         is not empty, otherwise, <code>null</code>
     * @see edu.snu.csne.csne2923.stacks.StackADT#peek()
     */
    public T peek()
    {
        T peeked = null;
        if( !_vector.isEmpty() )
        {
            peeked = _vector.get( 0 );
        }
        return peeked;
    }

    /**
     * Determines if the stack is empty.
     *
     * @return Returns <code>true</code> if the stack is empty,
     *         otherwise, <code>false</code>
     * @see edu.snu.csne.csne2923.stacks.StackADT#isEmpty()
     */
    public boolean isEmpty()
    {
        return _vector.isEmpty();
    }

    /**
     * Removes all entries from the stack.
     *
     * @see edu.snu.csne.csne2923.stacks.StackADT#clear()
     */
    public void clear()
    {
        _vector.clear();
    }

    /**
     * Returns a formatted description of this stack.  The description
     * contains all of the entries in the stack in first to last order.
     *
     * @return A formatted description of this stack
     * @see edu.snu.csne.csne2923.stacks.StackADT#toFormattedString()
     */
    public String toFormattedString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append( "Top=[ " );
        for( T entry : _vector )
        {
            builder.append( entry );
            builder.append( " " ); 
        }
        builder.append( "]=Bottom" );
        return builder.toString();
    }

    /**
     * TODO Method description
     *
     * @return
     * @see edu.snu.csne.csne3173.nested.StackADT#iterator()
     */
    @Override
    public Iterator<T> iterator()
    {
        return new VectorStackIterator();
    }
    
}
