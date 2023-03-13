package com.example.mealz.di

import com.example.data.remote.ApiServices
import com.example.data.repo.MealsRepoImpL
import com.example.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideApiService(apiServices: ApiServices): MealsRepo{
        return MealsRepoImpL(apiServices)
    }
}