 package com.example.animations

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.animations.databinding.ActivityMainBinding
import com.example.animations.databinding.FragmentTwoBinding

 class MainActivity : AppCompatActivity() {
     private lateinit var binding: ActivityMainBinding

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)

         binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)
         supportFragmentManager
             .beginTransaction()
             .add(R.id.nav_host_fragment_activity_main, FragmentOne())
             .commit()

     }

     private fun openFragment(fragment: Fragment){
         val transaction = supportFragmentManager.beginTransaction()
         transaction.replace(R.id.nav_host_fragment_activity_main, fragment)
         transaction.addToBackStack(null)
         transaction.commit()
     }

 }