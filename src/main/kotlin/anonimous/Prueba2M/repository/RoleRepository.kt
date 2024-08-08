package anonimous.Prueba2M.repository

import org.springframework.data.jpa.repository.JpaRepository
import javax.management.relation.Role

interface RoleRepository : JpaRepository<Role, Long>