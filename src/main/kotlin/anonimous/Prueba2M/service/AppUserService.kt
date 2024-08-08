package anonimous.Prueba2M.service

import anonimous.Prueba2M.controller.AppUser
import anonimous.Prueba2M.repository.AppUserRepository
import org.springframework.stereotype.Service

@Service
class AppUserService(private val userRepository: AppUserRepository) {
    fun saveUser(user: AppUser): AppUser = userRepository.save(user)
    fun getUserByUsername(username: String): AppUser? = userRepository.findByUsername(username)
    fun getUsers(): List<AppUser> = userRepository.findAll()
}