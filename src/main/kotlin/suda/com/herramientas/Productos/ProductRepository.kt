package suda.com.herramientas.Productos

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: JpaRepository<Product, Long> {

    fun DevolverUno(id: Long?): Product

    fun DevolverTodos(): List<Product>

    fun crearProducto(producto: Product) : Product

    fun actualizaProducto(producto: Product) : Product

    fun eliminarProducto(producto: Unit): Product
}