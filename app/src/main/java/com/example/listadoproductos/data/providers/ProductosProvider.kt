package com.example.listadoproductos.data.providers

import com.example.listadoproductos.Producto
import com.example.listadoproductos.R

class ProductosProvider {
    companion object {
        val productosList = listOf<Producto>(
            Producto(1, "Nativo", 1.00, "Fungicida", R.drawable.nativo),
            Producto(2, "Candonga", 1.00, "Insecticida", R.drawable.candonga),
            Producto(3, "Capsialil", 1.00, "Insecticida", R.drawable.capsialil),
            Producto(4, "Exalt", 1.00, "Insecticida", R.drawable.exalt),
            Producto(5, "Minotauro", 1.00, "Fungicida", R.drawable.minotauro)
        )
    }
}