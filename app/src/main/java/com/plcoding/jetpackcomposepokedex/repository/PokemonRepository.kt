package com.plcoding.jetpackcomposepokedex.repository

import com.plcoding.jetpackcomposepokedex.data.remote.responses.Pokemon
import com.plcoding.jetpackcomposepokedex.data.remote.responses.PokemonList
import com.plcoding.jetpackcomposepokedex.util.Resource

interface PokemonRepository {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList>
    suspend fun getPokemonInfo(pokemonName : String) : Resource<Pokemon>
}