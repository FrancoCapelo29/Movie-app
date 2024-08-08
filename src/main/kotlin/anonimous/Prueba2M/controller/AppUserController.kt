package anonimous.Prueba2M.controller

import anonimous.Prueba2M.service.AppUserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class AppUserController(private val userService: AppUserService) {

    @PostMapping
    fun createUser(@RequestBody user: AppUser): AppUser = userService.saveUser(user)

    @GetMapping
    fun getUsers(): List<AppUser> = userService.getUsers()
}