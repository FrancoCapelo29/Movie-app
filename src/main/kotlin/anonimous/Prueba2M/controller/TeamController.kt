package anonimous.Prueba2M.controller

import anonimous.Prueba2M.service.TeamService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/teams")
class TeamController(private val teamService: TeamService) {

    @GetMapping
    fun getAllTeams() = teamService.findAll()

    @PostMapping
    fun createTeam(@RequestBody team: Team) = teamService.save(team)
}