package com.example.cadastroempresa.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class AlterarEmpresaDTO(
    @field:NotNull
    var id: Int,
    @field:NotEmpty
    @field:Size(min = 1, max = 255)
    val nome: String,
    @field:NotEmpty
    @field:Size(min = 14, max = 14)
    val cnpj: String,
)