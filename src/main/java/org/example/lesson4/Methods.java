package org.example.lesson4;

import java.util.List;

public interface Methods<T extends Number> {
    T add(List<T> items);

    T divide(List<T> items);

    T multiply(List<T> items);
    List<String> toBinary(List<Object> items);
}