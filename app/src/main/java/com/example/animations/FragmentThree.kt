package com.example.animations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.animations.databinding.FragmentThreeBinding


class FragmentThree : Fragment() {
    private lateinit var binding: FragmentThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThreeBinding.inflate(inflater, container, false)
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
                    .replace(R.id.nav_host_fragment_activity_main, FragmentTwo())
                    .addToBackStack("animation")
                    .commit()
            }
        }
        return binding.root
    }
}