package com.ismailhakkiaydin.weather.api

import com.ismailhakkiaydin.weather.model.WeatherResponse
import com.ismailhakkiaydin.weather.util.Constant
import io.reactivex.Single
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class WeatherAPIClient {

    private val api = Retrofit.Builder()
        .baseUrl(Constant.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .client(getOkHttpClient())
        .build()
        .create(WeatherAPI::class.java)

    fun getDataFromGps(latitude: String, longitude: String, units:String): Single<WeatherResponse> {
        return api.getWeatherByGPS(latitude, longitude, units)
    }

    private fun getOkHttpClient(): OkHttpClient {
        val client = OkHttpClient.Builder()
        client.addInterceptor(RequestInterceptor())
        return client.build()
    }

}