package com.example.enbuenasmanos.controladores

import com.example.enbuenasmanos.entidades.Comunidad
import com.example.enbuenasmanos.logica.ComunidadBL

class ComunidadController {

    fun getOneComunidad(): Comunidad {
        return ComunidadBL().getOneComunidad()
    }

}