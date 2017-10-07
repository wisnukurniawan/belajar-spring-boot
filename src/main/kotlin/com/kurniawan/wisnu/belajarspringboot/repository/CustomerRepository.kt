package com.kurniawan.wisnu.belajarspringboot.repository

import com.kurniawan.wisnu.belajarspringboot.model.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByLastName(lastName: String): List<Customer>
}