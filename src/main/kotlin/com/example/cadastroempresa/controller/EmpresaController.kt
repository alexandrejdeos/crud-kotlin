package com.example.cadastroempresa.controller

import com.example.cadastroempresa.dto.AlterarEmpresaDTO
import com.example.cadastroempresa.dto.CadastroEmpresaDTO
import com.example.cadastroempresa.dto.ListarEmpresaDTO
import com.example.cadastroempresa.service.EmpresaService
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.HttpStatus.OK
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/empresa")
class EmpresaController(private val empresaService: EmpresaService) {

    @GetMapping
    @ResponseStatus(code = OK)
    fun listar(): List<ListarEmpresaDTO>? {
        return empresaService.listar()
    }

    @PostMapping
    @ResponseStatus(code = CREATED)
    fun cadastrar(@RequestBody @Valid cadastroEmpresaDTO: CadastroEmpresaDTO) {
        empresaService.cadastrar(cadastroEmpresaDTO)
    }

    @PutMapping
    @ResponseStatus(code = OK)
    fun alterar(@RequestBody @Valid alterarEmpresaDTO: AlterarEmpresaDTO) {
        empresaService.alterar(alterarEmpresaDTO)
    }

    @DeleteMapping
    @ResponseStatus(code = OK)
    fun deletar() {
    }
}