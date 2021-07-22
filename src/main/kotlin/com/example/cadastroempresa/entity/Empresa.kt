package com.example.cadastroempresa.entity

import java.io.Serializable
import java.time.LocalDateTime
import javax.persistence.*
import javax.persistence.GenerationType.IDENTITY

@Entity
@Table(name = "emp_empresa")
data class Empresa(
    @Id @GeneratedValue(strategy = IDENTITY)
    @Column(name = "emp_id", nullable = false)
    val id: Int? = null,

    @Column(name = "emp_nome", nullable = false)
    var nome: String = "",

    @Column(name = "emp_cnpj", nullable = false)
    var cnpj: String = "",

    @Column(name = "emp_data_cadastro", nullable = false)
    val dataCadastro: LocalDateTime = LocalDateTime.now(),

    ) : Serializable