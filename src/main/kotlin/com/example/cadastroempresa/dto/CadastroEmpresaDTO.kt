package com.example.cadastroempresa.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class CadastroEmpresaDTO(
    @field:NotEmpty(message = "Nome nao pode ser em branco")
    @field:Size(min = 1, max = 255, message = "Titulo deve ter entre 5 e 255 caracteres")
    val nome: String,
    @field:NotEmpty(message = "CNPJ nao pode ser em branco")
    @field:Size(min = 14, max = 14, message = "Titulo deve ter entre 5 e 255 caracteres")
    val cnpj: String,
)