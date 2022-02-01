package com.example.enbuenasmanos.controladores

import com.example.enbuenasmanos.logica.UsuarioBL

class UsuarioController {
    fun LoginUser(name: String, pass: String): Boolean {
        return UsuarioBL().LoginUser(
            name.trim().uppercase(),
            pass.trim().lowercase()
        )
    }
}