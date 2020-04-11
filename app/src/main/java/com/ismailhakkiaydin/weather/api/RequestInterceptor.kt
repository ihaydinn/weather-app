package com.ismailhakkiaydin.weather.api

import okhttp3.Interceptor
import okhttp3.Response

class RequestInterceptor:Interceptor {
     override fun intercept(chain: Interceptor.Chain):Response{
        val originalRequest = chain.request()
        val originalHttpUrl = originalRequest.url()

        val url = originalHttpUrl.newBuilder()
            .addQueryParameter("appid","ac52929f3f689be8f3c5d5e9f64d1c1e")
            .build()

        val request = originalRequest.newBuilder().url(url).build()

        return chain.proceed(request)
    }
}