package com.dabellan.primerprojectfinal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.dabellan.primerprojectfinal.databinding.ItemMarcasBinding

class MarcaAdapter(private val marcas: List<Marca>, private val listener: OnClickListener): RecyclerView.Adapter<MarcaAdapter.ViewHolder>() {

    private lateinit var context: Context

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val binding = ItemMarcasBinding.bind(view)



        fun setListener(marca: Marca) {
            binding.root.setOnClickListener { listener.onClickMarca(marca) }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val view =
            LayoutInflater.from(context).inflate(R.layout.item_marcas,
                parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = marcas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val marca=marcas.get(position)

        with(holder) {
            setListener(marca)
            binding.tvName.text = marca.nombre
            Glide.with(context)
                .load(marca.img)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .into(binding.imgMarca)
        }
    }

}