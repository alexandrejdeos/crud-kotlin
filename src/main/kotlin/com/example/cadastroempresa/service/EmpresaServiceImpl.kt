package com.example.cadastroempresa.service

import com.example.cadastroempresa.dto.CadastroEmpresaDTO
import com.example.cadastroempresa.dto.ListarEmpresaDTO
import com.example.cadastroempresa.entity.Empresa
import com.example.cadastroempresa.mapper.CadastroEmpresaMapper
import com.example.cadastroempresa.mapper.ListarEmpresaMapper
import com.example.cadastroempresa.repository.EmpresaRepository
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(
    private val empresaRepository: EmpresaRepository,
    private val listarEmpresaMapper: ListarEmpresaMapper,
    private val cadastroEmpresaMapper: CadastroEmpresaMapper,
) : EmpresaService {

    override fun cadastrar(cadastroEmpresaDTO: CadastroEmpresaDTO) {
        empresaRepository.save(cadastroEmpresaMapper.map(cadastroEmpresaDTO))
    }

    override fun listar(): List<ListarEmpresaDTO> {
        val empresas: List<Empresa> = empresaRepository.findAll()
        if (empresas.isNotEmpty()) {
            val empresasDTO = ArrayList<ListarEmpresaDTO>()
            empresas.forEach { empresa: Empresa -> empresasDTO.add(listarEmpresaMapper.map(empresa)) }
            return empresasDTO
        }
        return ArrayList()
    }

    override fun alterar() {
        TODO("Not yet implemented")
    }

    override fun excluir() {
        TODO("Not yet implemented")
    }
}