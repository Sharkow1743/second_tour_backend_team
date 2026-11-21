package ru.nto.team

import org.springframework.data.jpa.repository.JpaRepository

// TODO: extend JpaRepository only after the corresponding JPA model is connected.
interface StaffRepository : JpaRepository<Staff, Long> {
    fun findByCode(code: String): Staff?
}
interface PassRequestRepository
