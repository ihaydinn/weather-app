package com.ismailhakkiaydin.weather.api

import com.ismailhakkiaydin.weather.model.WeatherResponse
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface WeatherAPI {

    @GET("weather?")
    fun getWeatherByGPS(@Query("lat") latitude:String, @Query("lon") longitude:String): Single<WeatherResponse>
}