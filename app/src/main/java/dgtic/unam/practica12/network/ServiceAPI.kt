package dgtic.unam.practica12.network

import dgtic.unam.practica12.model.ModeloDog
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ServiceAPI {
    @GET
    suspend fun getBreedbyDogs(@Url url:String):Response<ModeloDog>
}