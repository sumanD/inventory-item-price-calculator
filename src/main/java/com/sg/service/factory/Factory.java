package com.sg.service.factory;

/**
 * Interface for Object Factories
 * @param <T>
 * @param <E>
 */
public interface Factory<T, E> {
    public T build(E e);
}
