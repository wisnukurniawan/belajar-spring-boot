package com.kurniawan.wisnu.belajarspringboot.controller

import com.kurniawan.wisnu.belajarspringboot.model.Customer
import com.kurniawan.wisnu.belajarspringboot.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController {

    @Autowired
    lateinit var costumerRepository: CustomerRepository

    @RequestMapping("/save")
    fun process(): String {
        costumerRepository.save(Customer("wisnu", "kurniawan 1"))
        costumerRepository.save(Customer("wisnu", "kurniawan 2"))
        costumerRepository.save(Customer("wisnu", "kurniawan 3"))
        costumerRepository.save(Customer("wisnu", "kurniawan 4"))
        costumerRepository.save(Customer("wisnu", "kurniawan 5"))
        return "Done"
    }

    @RequestMapping("/find_all")
    fun findAll(): String {
        var result = "<html>"
        costumerRepository.findAll().forEach {
            result += "<div> $it </div>>"
        }

        return result + "</html>"
    }

    @RequestMapping("/find_by_id")
    fun findById(@RequestParam("id") id: Long): String {
        var result = ""
        result = costumerRepository.findOne(id).toString()
        return result
    }

    @RequestMapping("/find_by_last_name")
    fun fetchDataByLastName(@RequestParam("last_name") lastName: String): String {
        var result = "<html>"
        costumerRepository.findByLastName(lastName).forEach {
            result += "<div> $it </div>"
        }

        return result + "</html>"
    }
}