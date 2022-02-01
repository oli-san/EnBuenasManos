package com.example.enbuenasmanos.presentacion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.enbuenasmanos.controladores.adapters.ComunidadAdapter
import com.example.enbuenasmanos.databinding.FragmentListarBinding
import com.example.enbuenasmanos.logica.ComunidadBL

class ListarFragment : Fragment(){

    private lateinit var binding: FragmentListarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListarBinding.inflate(inflater, container, false)

        val lstComunidad = ComunidadBL().getComunidadList()
        binding.listRecyclerView.adapter = ComunidadAdapter(lstComunidad)
        binding.listRecyclerView.layoutManager =
            LinearLayoutManager(binding.listRecyclerView.context)


        return binding.root
    }
}