package anonimous.Prueba2M.controller

import anonimous.Prueba2M.Model.Scenes
import anonimous.Prueba2M.service.SceneService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/ecenas")
class ScenesController {
    @Autowired
    lateinit var sceneService: SceneService

    @GetMapping
    fun list(): List<Scenes> {
        return sceneService.list()
    }

    @PostMapping
    fun save(@RequestBody scenes: Scenes): ResponseEntity<Scenes> {
        return ResponseEntity(sceneService.save(scenes), HttpStatus.OK)
    }

    @PutMapping
    fun update(@RequestBody scenes: Scenes): ResponseEntity<Scenes> {
        return ResponseEntity(sceneService.update(scenes), HttpStatus.OK)
    }

    @PatchMapping
    fun updateName(@RequestBody scenes: Scenes): ResponseEntity<Scenes> {
        return ResponseEntity(sceneService.updateName(scenes), HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun listById(@PathVariable("id") id: Long): ResponseEntity<Scenes> {
        return sceneService.listById(id)?.let {
            ResponseEntity(it, HttpStatus.OK)
        } ?: ResponseEntity(HttpStatus.NOT_FOUND)
    }

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id: Long): Boolean? {
        return sceneService.delete(id)
    }
}
