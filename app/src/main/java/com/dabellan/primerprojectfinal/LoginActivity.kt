package com.dabellan.primerprojectfinal

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.dabellan.primerprojectfinal.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_login)

        val preferences = getPreferences(Context.MODE_PRIVATE)


        var usuario=User(0,"","")

        val recuerdame=false

        val usernameRegistered=preferences.getString(getString(R.string.sp_user_registered), "")
        val passwordRegistered=preferences.getString(getString(R.string.sp_password_registered), "")

        if (binding.cbRemember.isChecked && usernameRegistered!="" && passwordRegistered!=""){
            binding.etUsername.setText(usernameRegistered)
            binding.etPassword.setText(passwordRegistered)
        }


        binding.btnLogin.setOnClickListener {
            val username = binding.etUsername.text.toString()
            val password = binding.etPassword.text.toString()

            with(preferences.edit()) {
                getString(R.string.sp_user_login)
                getString(R.string.sp_password_login)


            }

            if (username==usuario.name&&password==usuario.passw){
                val intent = Intent(this,PpantallaActivity::class.java)
                Toast.makeText(this, "Login correcto", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }

        }

        binding.btnRegister.setOnClickListener {
            val username = binding.etUsername.text.toString()
            val password = binding.etPassword.text.toString()
            usuario=User(1, username, password)

            with(preferences.edit()) {
                putString(getString(R.string.sp_user_registered), usuario.name)
                putString(getString(R.string.sp_password_registered), usuario.passw)
                    .apply()
            }
            Toast.makeText(this, "Usuario registrado", Toast.LENGTH_SHORT).show()
        }

        loadImage("https://www.npfbassettspole.com/img/stag-airsoft-player-in-fancy-dress.jpg", binding.imgLogin)

    }


    private fun loadImage(url: String, id: ImageView) {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(id)
    }

}