package com.example.cadastroempresa.mapper

import com.example.cadastroempresa.dto.ListarEmpresaDTO
import com.example.cadastroempresa.entity.Empresa
import org.springframework.stereotype.Component

@Component
class ListarEmpresaMapper : Mapper<Empresa, ListarEmpresaDTO> {
    override fun map(t: Empresa): ListarEmpresaDTO {
        return ListarEmpresaDTO(nome = t.nome, cnpj = t.cnpj, dataCadastro = t.dataCadastro, id = t.id)
    }
}