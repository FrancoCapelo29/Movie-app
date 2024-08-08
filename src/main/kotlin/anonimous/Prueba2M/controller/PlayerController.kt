package anonimous.Prueba2M.controller

import anonimous.Prueba2M.service.PlayerService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/players")
class PlayerController(private val playerService: PlayerService) {

    @GetMapping
    fun getAllPlayers() = playerService.findAll()

    @PostMapping
    fun createPlayer(@RequestBody player: Player) = playerService.save(player)
}