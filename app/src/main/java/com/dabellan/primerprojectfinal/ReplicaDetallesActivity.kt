package com.dabellan.primerprojectfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.dabellan.primerprojectfinal.databinding.ActivityLoginBinding
import com.dabellan.primerprojectfinal.databinding.ActivityReplicaDetallesBinding

class ReplicaDetallesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityReplicaDetallesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReplicaDetallesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cambiaNombreReplica:String=intent.extras?.getString("Nombre réplica").orEmpty()
        val cambiaMarcaReplica:String=intent.extras?.getString("Marca").orEmpty()
        val cambiaPrecioReplica:String=intent.extras?.getString("Precio").orEmpty()
        val cambiaImgReplica:String=intent.extras?.getString("Imagen").orEmpty()
        val cambiaDescReplica:String=intent.extras?.getString("Descripción").orEmpty()
        val cambiaSpecsReplica:String=intent.extras?.getString("Detalles").orEmpty()

        binding.replicaNameDetalles.text=cambiaNombreReplica
        binding.marcaReplicaDetalles.text=cambiaMarcaReplica
        binding.precioReplicaDetalles.text=cambiaPrecioReplica
        loadImage(binding.imgCardDetalles, cambiaImgReplica)
        binding.descripcionCuerpo.text=cambiaDescReplica
        binding.specsCuerpo.text=cambiaSpecsReplica
        loadImage(binding.btnPatras, "https://cdn-icons-png.flaticon.com/512/154/154630.png")
        binding.btnPatras.setOnClickListener {
            val intent = Intent(this,PpantallaActivity::class.java)
            startActivity(intent)
        }


    //setContentView(R.layout.activity_replica_detalles)
    }

    private fun loadImage(id: ImageView, url: String) {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(id)
    }

}