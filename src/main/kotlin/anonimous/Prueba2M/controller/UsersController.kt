package anonimous.Prueba2M.controller

import anonimous.Prueba2M.Model.Users
import anonimous.Prueba2M.service.UsersService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/auth")
class UsersController {
    @Autowired
    lateinit var usersService: UsersService

    @PostMapping("/register")
    fun register(@RequestBody users: Users): ResponseEntity<Users> {
        return try {
            val registeredUser = usersService.register(users)
            ResponseEntity(registeredUser, HttpStatus.CREATED)
        } catch (ex: Exception) {
            ResponseEntity(HttpStatus.BAD_REQUEST)
        }
    }

    @PostMapping("/login")
    fun login(@RequestBody credentials: Map<String, String>): ResponseEntity<String> {
        val username = credentials["username"] ?: return ResponseEntity(HttpStatus.BAD_REQUEST)
        val password = credentials["password"] ?: return ResponseEntity(HttpStatus.BAD_REQUEST)

        return try {
            usersService.authenticate(username, password)
            ResponseEntity("Login successful", HttpStatus.OK)
        } catch (ex: Exception) {
            ResponseEntity(HttpStatus.UNAUTHORIZED)
        }
        }
}