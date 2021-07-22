package com.example.cadastroempresa.dto

import java.time.LocalDateTime

data class ListarEmpresaDTO(
    var id: Int?,
    val nome: String,
    val cnpj: String,
    val dataCadastro: LocalDateTime,
)