package com.banking.service;

import java.util.Optional;

public interface IGeneralService<T>{

    Optional<T> findById(Long id);

    Iterable<T> findAll();

    void deleteById(Long id);

    void delete(Long id);

    void  save(T t);
}
