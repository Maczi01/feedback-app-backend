package com.feedback.app.common;

import com.feedback.app.user.service.WrongEmailException;

public interface Mapper<K, V> {

    V toEntity(K value);

    K toDTO(V value) throws WrongEmailException;
}
