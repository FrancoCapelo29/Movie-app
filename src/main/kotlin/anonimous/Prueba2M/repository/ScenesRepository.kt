package anonimous.Prueba2M.repository

import anonimous.Prueba2M.Model.Scenes
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ScenesRepository : JpaRepository<Scenes, Long>
