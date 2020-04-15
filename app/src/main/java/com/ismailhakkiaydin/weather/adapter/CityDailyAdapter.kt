package com.ismailhakkiaydin.weather.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ismailhakkiaydin.weather.R
import com.ismailhakkiaydin.weather.databinding.ForecastWeatherDailyItemBinding
import com.ismailhakkiaydin.weather.model.CityDailyResponse

class CityDailyAdapter(val cityDailyList: ArrayList<CityDailyResponse.Forecast>) :
    RecyclerView.Adapter<CityDailyAdapter.CityDailyViewHolder>() {
    class CityDailyViewHolder(var view: ForecastWeatherDailyItemBinding) :
        RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityDailyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<ForecastWeatherDailyItemBinding>(
            inflater,
            R.layout.forecast_weather_daily_item,
            parent,
            false
        )
        return CityDailyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cityDailyList.size
    }

    override fun onBindViewHolder(holder: CityDailyViewHolder, position: Int) {
        holder.view.dailyCityWeather = cityDailyList[position]

        holder.view.tvCityTemp.text = cityDailyList[position].main!!.temp.toInt().toString()

    }

    fun updateCityDailyLis(newCityDailyList: List<CityDailyResponse.Forecast>) {
        cityDailyList.clear()
        cityDailyList.addAll(newCityDailyList)
        notifyDataSetChanged()
    }
}