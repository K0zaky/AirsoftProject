package com.dabellan.primerprojectfinal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.dabellan.primerprojectfinal.databinding.ItemGunsBinding


class ReplicaAdapter (private val replicas: List<Replica>, private val listener: OnClickListener): RecyclerView.Adapter<ReplicaAdapter.ViewHolder>() {

    private lateinit var context: Context

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val binding = ItemGunsBinding.bind(view)



        fun setListener(replica: Replica) {
            binding.root.setOnClickListener { listener.onClickReplica(replica) }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val view =
            LayoutInflater.from(context).inflate(R.layout.item_guns,
                parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = replicas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val replica=replicas.get(position)

        with(holder) {
            setListener(replica)
            binding.replicaName.text = replica.nombre
            binding.marcaReplica.text = replica.marca
            binding.precioReplica.text = replica.precio
            Glide.with(context)
                .load(replica.img)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .into(binding.imgCard)
        }
    }

}