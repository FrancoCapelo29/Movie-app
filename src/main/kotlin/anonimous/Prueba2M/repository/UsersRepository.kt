package anonimous.Prueba2M.repository

import anonimous.Prueba2M.Model.Users
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface UsersRepository : JpaRepository<Users, Long> {
    fun findByUsername(username: String): Optional<Users>
    fun existsByUsername(username: String):Boolean
}