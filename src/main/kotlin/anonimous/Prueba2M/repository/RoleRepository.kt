package anonimous.Prueba2M.repository

import anonimous.Prueba2M.controller.AppRole
import org.springframework.data.jpa.repository.JpaRepository
import javax.management.relation.Role

interface AppRoleRepository : JpaRepository<AppRole, Long>