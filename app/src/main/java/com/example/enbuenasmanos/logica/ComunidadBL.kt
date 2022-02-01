package com.example.enbuenasmanos.logica

import com.example.enbuenasmanos.casosUso.ComunidadUseCase
import com.example.enbuenasmanos.entidades.Comunidad

class ComunidadBL {
    fun getComunidadList(): List<Comunidad> {
        return ComunidadUseCase().getAllComunidad()
    }

    fun getOneComunidad(): Comunidad {
        val r = (0..3).random()
        return ComunidadUseCase().getAllComunidad()[r]
    }
}