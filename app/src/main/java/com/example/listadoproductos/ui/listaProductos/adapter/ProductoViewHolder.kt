package com.example.listadoproductos.ui.listaProductos.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.listadoproductos.Producto
import com.example.listadoproductos.databinding.ItemProductoBinding

class ProductoViewHolder(itemView: View) : ViewHolder(itemView) {

    val binding = ItemProductoBinding.bind(itemView)

    fun render(productoModel: Producto) {
        binding.ivProducto.setImageResource(productoModel.miniatura)
        binding.tvCantidad.text = productoModel.cantidad.toString()
        binding.tvNombre.text = productoModel.nombre
        binding.tvTipo.text = productoModel.tipo
    }
}