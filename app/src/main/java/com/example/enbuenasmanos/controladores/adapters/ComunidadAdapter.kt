package com.example.enbuenasmanos.controladores.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.enbuenasmanos.R
import com.example.enbuenasmanos.databinding.ItemComunidadListBinding
import com.example.enbuenasmanos.entidades.Comunidad
import com.squareup.picasso.Picasso

class ComunidadAdapter(val comunidadItemsList: List<Comunidad>) : RecyclerView.Adapter<ComunidadViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComunidadViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_comunidad_list, parent, false)
        return ComunidadViewHolder(view)
    }

    override fun onBindViewHolder(holder: ComunidadViewHolder, position: Int) {
        val item =  comunidadItemsList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = comunidadItemsList.size
}

class ComunidadViewHolder(comunidadView: View) : RecyclerView.ViewHolder(comunidadView) {

    val binding = ItemComunidadListBinding.bind(comunidadView)

    fun render(item : Comunidad) {
        binding.txtTitulo.text = item.title
        binding.txtDescripcion.text = item.desc
        Picasso.get().load(item.img).into(binding.imgNews1)
    }

}