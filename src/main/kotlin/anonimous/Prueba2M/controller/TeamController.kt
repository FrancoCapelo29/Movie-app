package anonimous.Prueba2M.controller

import anonimous.Prueba2M.service.TeamService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/teams")
class TeamController(private val teamService: TeamService) {

    @PostMapping
    fun createTeam(@RequestBody team: Team): Team = teamService.saveTeam(team)

    @GetMapping
    fun getTeams(): List<Team> = teamService.getTeams()
}