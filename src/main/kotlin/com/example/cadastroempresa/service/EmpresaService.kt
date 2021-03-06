package com.example.cadastroempresa.service

import com.example.cadastroempresa.dto.AlterarEmpresaDTO
import com.example.cadastroempresa.dto.CadastroEmpresaDTO
import com.example.cadastroempresa.dto.ListarEmpresaDTO

interface EmpresaService {

    fun cadastrar(cadastroEmpresaDTO: CadastroEmpresaDTO)
    fun listar(): List<ListarEmpresaDTO>
    fun alterar(alterarEmpresaDTO: AlterarEmpresaDTO)
    fun excluir(id: Int)
}