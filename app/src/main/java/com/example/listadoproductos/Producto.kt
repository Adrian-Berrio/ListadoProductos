package com.example.listadoproductos

data class Producto(
    val id: Int,
    val nombre: String,
    val cantidad: Double,
    val tipo: String,
    val miniatura: Int
)