package com.ismailhakkiaydin.weather.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.ismailhakkiaydin.weather.api.WeatherAPIClient
import com.ismailhakkiaydin.weather.model.CityDailyResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class CityDailyViewModel(application: Application) : AndroidViewModel(application) {

    private val apiClient = WeatherAPIClient()
    private val disposable = CompositeDisposable()

    val cityDailyData = MutableLiveData<List<CityDailyResponse.Forecast>>()
    var cityDailyDataList: List<CityDailyResponse.Forecast> = ArrayList()
    val cityDailyLoading = MutableLiveData<Boolean>()

    fun getCityDailyWeatherFromGps(latitude: String, longitude: String, cnt: String, units: String) {
        cityDailyLoading.value = true
        disposable.add(
            apiClient.getCityDailyWeatherFromGps(latitude, longitude, cnt, units)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<CityDailyResponse>() {
                    override fun onSuccess(t: CityDailyResponse) {
                        var cityDailyResponse = t
                        cityDailyDataList = cityDailyResponse.list!!
                        cityDailyData.value = cityDailyDataList
                        cityDailyLoading.value = false
                        Log.i("Daily Data : ", "Çalıştı")
                    }

                    override fun onError(e: Throwable) {
                        Log.i("Daily Data : ", "HATA")
                    }

                }
            )
        )
    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }


}