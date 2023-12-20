package com.example.projectmassive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.projectmassive.databinding.ActivityMainBinding
import com.example.projectmassive.fragment.ActivityFragment
import com.example.projectmassive.fragment.HomeFragment
import com.example.projectmassive.fragment.BerandaFragment
import com.example.projectmassive.fragment.ProfilFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(BerandaFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.homeFragment -> replaceFragment(BerandaFragment())
                R.id.catatanFragment -> replaceFragment(HomeFragment())
                R.id.profilFragment -> replaceFragment(ProfilFragment())

                else ->{

                }
            }
            true
        }

    }
    private fun replaceFragment (fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView,fragment)
        fragmentTransaction.commit()
    }
}