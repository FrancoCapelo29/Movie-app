package anonimous.Prueba2M.repository

import anonimous.Prueba2M.controller.Team
import org.springframework.data.jpa.repository.JpaRepository

interface TeamRepository : JpaRepository<Team, Long>