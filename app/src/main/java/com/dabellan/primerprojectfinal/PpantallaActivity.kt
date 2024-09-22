package com.dabellan.primerprojectfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class PpantallaActivity : AppCompatActivity(), OnClickListener {

    private lateinit var bottomNavigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ppantalla)

        initcomponents()
        initListeners()
        replaceFragment(MarcasFragment())
    }

    private fun initListeners(){
        bottomNavigationView.setOnItemSelectedListener {
                menuItem ->
            when(menuItem.itemId) {
                R.id.bottom_marcas -> {
                    replaceFragment(MarcasFragment())
                    true
                }
                R.id.bottom_guns -> {
                    replaceFragment(GunsFragment())
                    true
                }
                R.id.bottom_profile -> {
                    replaceFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frameContainer, fragment).commit()
    }

    private fun initcomponents() {
        bottomNavigationView = findViewById(R.id.bottom_navigation)
    }
}