package suda.com.herramientas.Productos

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController {
    @Autowired
    lateinit var productService: ProductService

    @GetMapping("/listar")
    @ResponseBody
    fun listar(): List<Product> {
        return productService.obtenerProductos()
    }
    @GetMapping("/productos/{id}")
    fun obtenerProducto(@PathVariable id: Long): Product {
        return productService.obtenerProducto(id)
    }

    // Crear un producto
    @PostMapping("/productos")
    @ResponseStatus(HttpStatus.CREATED)
    fun crearProducto(@RequestBody product: Product): Product {
        return productService.crearProducto(product)
    }

    @PutMapping("/productos/{id}")
    fun actualizarProducto(
        @PathVariable id: Long,
        @RequestBody product: Product
    ): Product {
        product.id = id
        return productService.actualizarProducto(product)
    }

    @DeleteMapping("/productos/{id}")
    fun eliminarProducto(@PathVariable id: Long): Product {
        val product = productService.obtenerProducto(id)
        return productService.eliminarProducto(product)
    }
}//
