package com.sg.service.factory;

public interface Factory<T, E> {
    public T build(E e);
}
