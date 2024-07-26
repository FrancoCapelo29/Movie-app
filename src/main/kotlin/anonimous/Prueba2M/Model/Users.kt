package anonimous.Prueba2M.Model

import jakarta.persistence.*

@Entity
@Table(name = "users")
class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    var id: Long? = null

    @Column(name = "first_name", nullable = false)
    var firstName: String? = null

    @Column(name = "last_name", nullable = false)
    var lastName: String? = null

    @Column(name = "username", unique = true, nullable = false)
    var username: String? = null

    @Column(name = "password", nullable = false)
    var password: String?=null
}
