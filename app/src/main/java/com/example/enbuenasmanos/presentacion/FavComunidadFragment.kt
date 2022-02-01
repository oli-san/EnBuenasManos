package com.example.enbuenasmanos.presentacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.enbuenasmanos.R
import com.example.enbuenasmanos.databinding.FragmentFavComunidadBinding

class FavComunidadFragment : Fragment() {

    private lateinit var binding: FragmentFavComunidadBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFavComunidadBinding.inflate(inflater,container,false)

        return binding.root
    }

}