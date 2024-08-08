package anonimous.Prueba2M.service

import anonimous.Prueba2M.controller.Team
import anonimous.Prueba2M.repository.TeamRepository
import org.springframework.stereotype.Service


@Service
class TeamService(private val teamRepository: TeamRepository) {
    fun findAll(): List<Team> = teamRepository.findAll()
    fun save(team: Team): Team = teamRepository.save(team)
}