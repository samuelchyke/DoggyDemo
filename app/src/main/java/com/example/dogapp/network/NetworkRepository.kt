package com.example.dogapp.network

import com.example.dogapp.data.Dogs
import retrofit2.Response
import javax.inject.Inject

interface NetworkRepository {

    suspend fun getListOfDogs() : Response<Dogs>

}

class NetworkRepositoryImpl @Inject constructor(
    private val dogServiceApi: DogApiService
):NetworkRepository{

    override suspend fun getListOfDogs(): Response<Dogs> {
        return dogServiceApi.searchImages()
    }

}