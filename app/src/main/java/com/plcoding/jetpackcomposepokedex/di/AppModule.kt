package com.plcoding.jetpackcomposepokedex.di

import com.plcoding.jetpackcomposepokedex.data.remote.PokeApi
import com.plcoding.jetpackcomposepokedex.repository.PokemonRepositoryImplement
import com.plcoding.jetpackcomposepokedex.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providePokemonRepository(
        api: PokeApi
    ) = PokemonRepositoryImplement(api)

    @Singleton
    @Provides
    fun providePokemonApi(): PokeApi{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(PokeApi::class.java)
    }

}