/*
 * Copyright 2008-2011 Brookhaven National Laboratory
 * All rights reserved. Use is subject to license terms.
 */
package org.epics.pvmanager;

/**
 * An object representing a writable PV. The write payload is specified by the generic type,
 * and is changed is returned by {@link #write(java.lang.Object)}. Changes in
 * values are notified through the {@link PVValueChangeListener}. Listeners
 * can be registered from any thread. The value can only be accessed on the
 * thread on which the listeners is called.
 *
 * @author carcassi
 */
public interface PVWriter<T> {

    /**
     * Adds a listener to the value. This method is thread safe.
     *
     * @param listener a new listener
     */
    public void addPVValueWriteListener(PVValueWriteListener listener);

    /**
     * Removes a listener to the value. This method is thread safe.
     *
     * @param listener the old listener
     */
    public void removePVValueChangeListener(PVValueWriteListener listener);
    
    /**
     * Writes a new value. This method can be synchronous or synchronous
     * depending on how the PV was created.
     * 
     * @param newValue 
     */
    public void write(T newValue);

    /**
     * De-registers all listeners, stops all notifications and closes all
     * connections from the data sources needed by this. Once the PV
     * is closed, it can't be re-opened. Subsequent calls to close do not
     * do anything.
     */
    public void close();

    /**
     * True if no more notifications are going to be sent for this PV.
     *
     * @return true if closed
     */
    public boolean isClosed();

    /**
     * Returns the last exception that was generated by write operations
     * and clears it (subsequent call will return null).
     *
     * @return the last generated exception or null
     */
    public Exception lastWriteException();
    
}
