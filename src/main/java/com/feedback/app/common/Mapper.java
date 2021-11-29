package com.feedback.app.common;

public interface Mapper<K, V> {

    V toEntity(K value);

    K toDTO(V value);
}
