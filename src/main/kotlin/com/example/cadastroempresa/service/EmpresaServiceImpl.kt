package com.example.cadastroempresa.service

import com.example.cadastroempresa.dto.AlterarEmpresaDTO
import com.example.cadastroempresa.dto.CadastroEmpresaDTO
import com.example.cadastroempresa.dto.ListarEmpresaDTO
import com.example.cadastroempresa.entity.Empresa
import com.example.cadastroempresa.mapper.CadastroEmpresaMapper
import com.example.cadastroempresa.mapper.ListarEmpresaMapper
import com.example.cadastroempresa.repository.EmpresaRepository
import javassist.NotFoundException
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class EmpresaServiceImpl(
    private val empresaRepository: EmpresaRepository,
    private val listarEmpresaMapper: ListarEmpresaMapper,
    private val cadastroEmpresaMapper: CadastroEmpresaMapper,
) : EmpresaService {

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    override fun cadastrar(cadastroEmpresaDTO: CadastroEmpresaDTO) {
        empresaRepository.save(cadastroEmpresaMapper.map(cadastroEmpresaDTO))
    }

    @Transactional
    override fun listar(): List<ListarEmpresaDTO> {
        val empresas: List<Empresa> = empresaRepository.findAll()
        if (empresas.isNotEmpty()) {
            val empresasDTO = ArrayList<ListarEmpresaDTO>()
            empresas.forEach { empresa: Empresa -> empresasDTO.add(listarEmpresaMapper.map(empresa)) }
            return empresasDTO
        }
        return ArrayList()
    }

    @Transactional
    override fun alterar(alterarEmpresaDTO: AlterarEmpresaDTO) {
        val empresa = empresaRepository.findById(alterarEmpresaDTO.id)
            .orElseThrow { NotFoundException("Empresa não encontrada") }

        empresa.cnpj = alterarEmpresaDTO.cnpj
        empresa.nome = alterarEmpresaDTO.nome

        empresaRepository.save(empresa)

    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    override fun excluir(id: Int) {
        val empresa = empresaRepository.findById(id)
            .orElseThrow { NotFoundException("Empresa não encontrada") }
        empresaRepository.delete(empresa)
    }
}