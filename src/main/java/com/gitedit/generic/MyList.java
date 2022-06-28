package com.gitedit.generic;

/**
 * The interface My list.
 *
 * @param <E> the type parameter
 * @author king
 */
public interface MyList<E> {
    /**
     * Size int.
     *
     * @return the int
     */
    int size();

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
    boolean isEmpty();

    /**
     * Add.
     *
     * @param e the e
     */
    void add(E e);

}
