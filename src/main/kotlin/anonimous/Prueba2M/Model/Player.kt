package anonimous.Prueba2M.controller

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
data class Player(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val fullName: String,

    @Column(nullable = false)
    val age: Int,

    @Column(nullable = false)
    val position: String,

    @ManyToOne
    @JoinColumn(name = "team_id")
    val team: Team
)