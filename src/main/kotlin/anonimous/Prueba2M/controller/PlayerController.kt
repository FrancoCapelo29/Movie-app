package anonimous.Prueba2M.controller

import anonimous.Prueba2M.service.PlayerService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/players")
class PlayerController(private val playerService: PlayerService) {

    @PostMapping
    fun createPlayer(@RequestBody player: Player): Player = playerService.savePlayer(player)

    @GetMapping
    fun getPlayers(): List<Player> = playerService.getPlayers()
}