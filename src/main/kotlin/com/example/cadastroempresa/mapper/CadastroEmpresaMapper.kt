package com.example.cadastroempresa.mapper

import com.example.cadastroempresa.dto.CadastroEmpresaDTO
import com.example.cadastroempresa.entity.Empresa
import org.springframework.stereotype.Component

@Component
class CadastroEmpresaMapper : Mapper<CadastroEmpresaDTO, Empresa> {
    override fun map(t: CadastroEmpresaDTO): Empresa {
        return Empresa(nome = t.nome, cnpj = t.cnpj)
    }
}