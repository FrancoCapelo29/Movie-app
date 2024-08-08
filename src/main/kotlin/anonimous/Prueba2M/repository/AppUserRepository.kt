package anonimous.Prueba2M.repository

import anonimous.Prueba2M.controller.AppUser
import org.springframework.data.jpa.repository.JpaRepository

interface AppUserRepository : JpaRepository<AppUser, Long> {
    fun findByUsername(username: String): AppUser?
}