package anonimous.Prueba2M.Model

import jakarta.persistence.*
@Entity
@Table(name = "scenes")
class Scenes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    var id: Long? = null

    @Column(name = "name_scene")
    var nameScene: String? = null

    @Column(name = "budget")
    var budget: Int? = null

    @Column(name = "minutes")
    var minutes: Int? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    var movie: Movies? = null

    @OneToMany(mappedBy = "scene", cascade = [CascadeType.ALL], orphanRemoval = true)
    var characters: List<Character> = mutableListOf()
}