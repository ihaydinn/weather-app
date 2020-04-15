package com.ismailhakkiaydin.weather.api

import com.ismailhakkiaydin.weather.model.CityDailyResponse
import com.ismailhakkiaydin.weather.model.ForecastResponse
import com.ismailhakkiaydin.weather.model.WeatherResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {

    @GET("weather?")
    fun getWeatherByGPS(@Query("lat") latitude: String, @Query("lon") longitude: String, @Query("units") units: String): Single<WeatherResponse>

    @GET("forecast?")
    fun getForecastByGPS(@Query("lat") latitude: String, @Query("lon") longitude: String, @Query("units") units: String): Single<ForecastResponse>

    @GET("find?")
    fun getCityDailyWeatherByGPS(
        @Query("lat") latitude: String, @Query("lon") longitude: String, @Query(
            "cnt"
        ) cnt: String, @Query("units") units: String
    ): Single<CityDailyResponse>
}