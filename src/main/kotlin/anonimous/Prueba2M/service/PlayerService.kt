package anonimous.Prueba2M.service

import anonimous.Prueba2M.controller.Player
import anonimous.Prueba2M.repository.PlayerRepository
import org.springframework.stereotype.Service

@Service
class PlayerService(private val playerRepository: PlayerRepository) {
    fun findAll(): List<Player> = playerRepository.findAll()
    fun save(player: Player): Player = playerRepository.save(player)
}