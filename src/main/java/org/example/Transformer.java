package org.example;

public interface Transformer<T> {
    T transformOriginal(T original);
}

//public interface Transformer {
//    Integer transformOriginal(Integer original);
//}
