package anonimous.Prueba2M.repository

import anonimous.Prueba2M.controller.Player
import org.springframework.data.jpa.repository.JpaRepository

interface PlayerRepository : JpaRepository<Player, Long>
