package com.kurniawan.wisnu.belajarspringboot.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "customer")
class Customer : Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var id: Long = 0

    @Column(name = "first_name")
    private var firstName: String? = ""

    @Column(name = "last_name")
    private var lastName: String? = ""

    constructor()

    constructor(firstName: String,
                lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
    }

    override fun toString(): String {
        return "Customer[id=$id, firstName=$firstName, lastName=$lastName]"
    }
}