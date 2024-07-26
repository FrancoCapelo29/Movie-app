package anonimous.Prueba2M.service

import anonimous.Prueba2M.Model.Users
import anonimous.Prueba2M.repository.UsersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class UsersService {
    @Autowired
    lateinit var usersRepository: UsersRepository

    fun register(users: Users): Users {
        try {
            // Verificar si el username ya existe
            if (usersRepository.existsByUsername(users.username ?: throw ResponseStatusException(HttpStatus.BAD_REQUEST, "Username cannot be null"))) {
                throw ResponseStatusException(HttpStatus.BAD_REQUEST, "Username already exists")
            }

            // Guardar el nuevo usuario
            return usersRepository.save(users)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, ex.message)
        }
    }

    fun authenticate(username: String, password: String): Boolean {
        try {
            // Buscar el usuario por username
            val user = usersRepository.findByUsername(username)
                .orElseThrow { ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid username or password") }

            // Verificar la contraseña en texto plano
            if (user.password != password) {
                throw ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid username or password")
            }

            return true
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.UNAUTHORIZED, ex.message)
        }
        }
}