package com.example.cadastroempresa.repository

import com.example.cadastroempresa.entity.Empresa
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmpresaRepository : JpaRepository<Empresa, Int>