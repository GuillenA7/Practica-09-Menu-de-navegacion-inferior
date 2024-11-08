package com.example.prctica09_mendenavegacininferior

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.prctica09_mendenavegacininferior.ui.nosotros.NosotrosFragment
import com.example.prctica09_mendenavegacininferior.ui.galeria.GaleriaFragment
import com.example.prctica09_mendenavegacininferior.ui.credito.CreditoFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            val selectedFragment: Fragment = when (menuItem.itemId) {
                R.id.nav_nosotros -> NosotrosFragment()
                R.id.nav_galeria -> GaleriaFragment()
                R.id.nav_credito -> CreditoFragment()
                else -> NosotrosFragment()
            }
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, selectedFragment)
                .commit()
            true
        }

        // Set default selection
        bottomNavigationView.selectedItemId = R.id.nav_nosotros
    }
}