package edu.snu.csne.csne2923.sorting;

/**
 * Sorter
 *
 * This interface describes the client interface to a generic sort
 * algorithm.
 *
 * @author B. Eskridge
 */
public interface Sorter<T extends Comparable<? super T>>
{
    /**
     * Sorts the given array.
     *
     * @param unsorted The array to sort
     * @return The sorted array
     */
    public T[] sort( T[] unsorted );

}

