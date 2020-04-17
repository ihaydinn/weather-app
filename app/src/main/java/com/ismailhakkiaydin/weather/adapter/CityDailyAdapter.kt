package com.ismailhakkiaydin.weather.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.ismailhakkiaydin.weather.R
import com.ismailhakkiaydin.weather.databinding.ForecastWeatherDailyItemBinding
import com.ismailhakkiaydin.weather.model.CityDailyResponse
import kotlinx.android.synthetic.main.forecast_weather_daily_item.view.*

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

        holder.itemView.setOnClickListener {
            val bundle = bundleOf("cityWeatherDetail" to cityDailyList[position])
            Navigation.findNavController(it).navigate(R.id.action_oneDayFragment_to_oneDayDetailFragment2, bundle)
        }
    }

    fun updateCountryList(newCountryList: List<CityDailyResponse.Forecast>) {
        cityDailyList.clear()
        cityDailyList.addAll(newCountryList)
        notifyDataSetChanged()
    }


}