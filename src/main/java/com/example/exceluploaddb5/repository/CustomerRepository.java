package com.example.exceluploaddb5.repository;

import com.example.exceluploaddb5.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
