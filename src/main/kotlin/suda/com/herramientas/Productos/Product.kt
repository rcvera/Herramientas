package suda.com.herramientas.Productos

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "productos")
class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    var id: Long? = null
    var nombre: String? = null
    var description: String? = null
    var price: Double? = null
}