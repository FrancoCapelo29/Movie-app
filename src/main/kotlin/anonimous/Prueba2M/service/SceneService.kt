package anonimous.Prueba2M.service

import anonimous.Prueba2M.Model.Scenes
import anonimous.Prueba2M.repository.ScenesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SceneService {
    @Autowired
    lateinit var scenesRepository: ScenesRepository

    fun list(): List<Scenes> {
        return scenesRepository.findAll()
    }

    fun save(scene: Scenes): Scenes {
        return scenesRepository.save(scene)
    }

    fun update(scene: Scenes): Scenes {
        return scenesRepository.save(scene)
    }

    fun updateName(scene: Scenes): Scenes {
        // Implementar la lógica para actualizar el nombre si es necesario
        return scenesRepository.save(scene)
    }

    fun listById(id: Long): Scenes? {
        return scenesRepository.findById(id).orElse(null)
    }

    fun delete(id: Long): Boolean {
        return try {
            scenesRepository.deleteById(id)
            true
        } catch (e: Exception) {
            false
        }
    }
}
