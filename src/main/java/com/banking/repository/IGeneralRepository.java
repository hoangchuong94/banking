package com.banking.repository;

import com.banking.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface IGeneralRepository extends CrudRepository<Customer, Long> {
}
