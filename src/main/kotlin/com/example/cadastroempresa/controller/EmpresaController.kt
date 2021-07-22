package com.example.cadastroempresa.controller

import com.example.cadastroempresa.dto.CadastroEmpresaDTO
import com.example.cadastroempresa.dto.ListarEmpresaDTO
import com.example.cadastroempresa.service.EmpresaService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/empresa")
class EmpresaController(
    private val empresaService: EmpresaService,
) {

    @GetMapping
    fun listar(): List<ListarEmpresaDTO>? {
        return empresaService.listar()
    }

    @PostMapping
    fun cadastrar(@RequestBody cadastroEmpresaDTO: CadastroEmpresaDTO) {
        empresaService.cadastrar(cadastroEmpresaDTO)
    }

    @PutMapping
    fun alterar() {
    }

    @DeleteMapping
    fun deletar() {
    }
}