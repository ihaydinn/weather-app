package com.ismailhakkiaydin.weather.api

import com.ismailhakkiaydin.weather.model.WeatherResponse
import io.reactivex.Single
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class WeatherAPIClient {

    private val BASE_URL = "https://api.openweathermap.org/data/2.5/"

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .client(getOkHttpClient())
        .build()
        .create(WeatherAPI::class.java)

    fun getDataFromGps(latitude: String, longitude: String): Single<WeatherResponse> {
        return api.getWeatherByGPS(latitude, longitude)
    }

    private fun getOkHttpClient():OkHttpClient{
        val client = OkHttpClient.Builder()
        client.addInterceptor(RequestInterceptor())
        return client.build()
    }

}