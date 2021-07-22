package com.example.cadastroempresa.mapper

interface Mapper<T, U> {

    fun map(t: T): U

}
