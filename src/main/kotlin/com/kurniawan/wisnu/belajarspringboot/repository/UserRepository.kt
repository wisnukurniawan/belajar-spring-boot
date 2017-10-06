package com.kurniawan.wisnu.belajarspringboot.repository

import com.kurniawan.wisnu.belajarspringboot.model.Users
import org.springframework.data.jpa.repository.JpaRepository

interface UsersRepository : JpaRepository<Users, Long>