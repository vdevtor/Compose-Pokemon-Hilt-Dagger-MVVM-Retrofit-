package com.plcoding.jetpackcomposepokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.plcoding.jetpackcomposepokedex.data.remote.responses.Pokemon
import com.plcoding.jetpackcomposepokedex.repository.PokemonRepositoryImplement
import com.plcoding.jetpackcomposepokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository : PokemonRepositoryImplement
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName : String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}