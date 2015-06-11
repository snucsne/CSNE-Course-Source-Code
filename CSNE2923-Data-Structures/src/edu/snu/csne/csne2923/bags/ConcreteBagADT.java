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
package edu.snu.csne.csne2923.bags;

import java.util.Set;

/**
 * TODO Class description
 *
 * @author Brent Eskridge
 */
public class ConcreteBagADT<T> implements BagADT<T>
{

    /**
     * Adds a new entry to the bag.
     *
     * @param entry The entry to be added to the bag
     * @return Returns <code>true</code> if successful, otherwise,
     *         <code>false</code>.
     * @see edu.snu.csne.csne2923.bags.BagADT#add(java.lang.Object)
     */
    public boolean add( T entry )
    {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * Removes one occurrence of the specified entry from the bag,
     * if possible.
     * 
     * @param entry The entry to remove
     * @return Returns the removed entry if successful, otherwise,
     *         <code>null</code>.
     * @see edu.snu.csne.csne2923.bags.BagADT#remove(java.lang.Object)
     */
    public T remove( T entry )
    {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Determines if the specified entry is in the bag.
     *
     * @param entry The entry
     * @return Returns <code>true</code> if the entry is in the bag,
     *         otherwise, <code>false</code>.
     * @see edu.snu.csne.csne2923.bags.BagADT#contains(java.lang.Object)
     */
    public boolean contains( T entry )
    {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * Returns the number of occurrences of the specified entry
     * in the bag.
     *
     * @param entry The entry
     * @return Returns the number of occurrences of the specified
     * entry in the bag.
     * @see edu.snu.csne.csne2923.bags.BagADT#getCount(java.lang.Object)
     */
    public int getCount( T entry )
    {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * Returns a <code>Set</code> containing the unique entries
     * in the bag.
     *
     * @return Returns a <code>Set</code> containing the unique
     * entries in the bag.
     * @see edu.snu.csne.csne2923.bags.BagADT#getUniqueSet()
     */
    public Set<T> getUniqueSet()
    {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Returns an array containing all the entries in this bag
     *
     * @return An array containing all the entries in this bag
     * @see edu.snu.csne.csne2923.bags.BagADT#toArray()
     */
    public T[] toArray()
    {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Determines if the bag is empty.
     *
     * @return Returns <code>true</code> if the bag is empty,
     *         otherwise, <code>false</code>
     * @see edu.snu.csne.csne2923.bags.BagADT#isEmpty()
     */
    public boolean isEmpty()
    {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * Determines if the bag is full.
     *
     * @return Returns <code>true</code> if the bag is full,
     *         otherwise, <code>false</code>
     * @see edu.snu.csne.csne2923.bags.BagADT#isFull()
     */
    public boolean isFull()
    {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * TODO Method description
     *
     * @return
     * @see edu.snu.csne.csne2923.bags.BagADT#size()
     */
    public int size()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * TODO Method description
     *
     * @see edu.snu.csne.csne2923.bags.BagADT#clear()
     */
    public void clear()
    {
        // TODO Auto-generated method stub
        
    }

    /**
     * TODO Method description
     *
     * @return
     * @see edu.snu.csne.csne2923.bags.BagADT#toFormattedString()
     */
    public String toFormattedString()
    {
        // TODO Auto-generated method stub
        return null;
    }

}
