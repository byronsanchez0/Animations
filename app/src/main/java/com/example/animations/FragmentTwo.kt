package com.example.animations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.animations.databinding.FragmentOneBinding
import com.example.animations.databinding.FragmentThreeBinding
import com.example.animations.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {
    private lateinit var binding: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTwoBinding.inflate(inflater, container, false)
        binding.btnNext.setOnClickListener {
            activity?.let {
                it.supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(
                        R.anim.slide_in,
                        R.anim.slide_out,
                        R.anim.slide_in,
                        R.anim.slide_out
                    )
                    .replace(R.id.nav_host_fragment_activity_main, FragmentThree())
                    .addToBackStack("animation")
                    .commit()
            }
        }
        binding.btnPrevious.setOnClickListener {
            activity?.let {
                it.supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(
                        R.anim.slide_in,
                        R.anim.slide_out,
                        R.anim.slide_in,
                        R.anim.slide_out
                    )
                    .replace(R.id.nav_host_fragment_activity_main, FragmentOne())
                    .addToBackStack("animation")
                    .commit()
            }
        }
        return binding.root
    }
}