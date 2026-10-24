package suda.com.herramientas.Productos

import org.springframework.stereotype.Service

@Service
class ProductService(
    private val productRepository: ProductRepository
) {

    // Obtener todos los productos
    fun obtenerProductos(): List<Product> {
        return productRepository.findAll()
    }

    fun obtenerProducto(id: Long): Product {
        return productRepository.findById(id)
            .orElseThrow {
                RuntimeException("Producto no encontrado")
            }
    }

    fun crearProducto(product: Product): Product {
        return productRepository.save(product)
    }

    fun actualizarProducto(product: Product): Product {
        return productRepository.save(product)
    }
    fun eliminarProducto(product: Product): Product {
        productRepository.delete(product)
        return product
    }
}