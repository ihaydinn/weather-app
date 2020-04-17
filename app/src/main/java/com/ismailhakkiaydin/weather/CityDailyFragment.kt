package com.ismailhakkiaydin.weather

import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.ismailhakkiaydin.weather.adapter.CityDailyAdapter
import com.ismailhakkiaydin.weather.databinding.FragmentCityDailyBinding
import com.ismailhakkiaydin.weather.util.Constant
import com.ismailhakkiaydin.weather.viewmodel.CityDailyViewModel
import im.delight.android.location.SimpleLocation
import kotlinx.android.synthetic.main.fragment_city_daily.*

class CityDailyFragment : Fragment() {

    private val REQUEST_CODE = 1

    var location: SimpleLocation? = null
    var latitude: String? = null
    var longitude: String? = null

    private lateinit var viewModel :CityDailyViewModel
    private lateinit var dataBinding: FragmentCityDailyBinding

    private var cityDailyAdapter = CityDailyAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_city_daily, container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = cityDailyAdapter

        viewModel = ViewModelProviders.of(this).get(CityDailyViewModel::class.java)

        location = SimpleLocation(context)
        if (!location!!.hasLocationEnabled()) {
            SimpleLocation.openSettings(context)
        } else {
            if (ContextCompat.checkSelfPermission(
                    activity!!,
                    android.Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    activity!!,
                    arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
                    REQUEST_CODE
                )
            } else {
                location = SimpleLocation(context)
                latitude = String.format("%.6f", location?.latitude)
                longitude = String.format("%.6f", location?.longitude)
                Log.e("LAT1", "" + latitude)
                Log.e("LONG1", "" + longitude)

            }
        }

        viewModel.getCityDailyWeatherFromGps(latitude!!,longitude!!,Constant.CNT,Constant.METRIC)

        viewModel.cityDailyData.observe(viewLifecycleOwner, Observer {cityDailyWeatherGps ->
            cityDailyWeatherGps.let {
                recyclerView.visibility = View.VISIBLE
                cityDailyAdapter.updateCountryList(cityDailyWeatherGps)
            }
        })

        viewModel.cityDailyLoading.observe(viewLifecycleOwner, Observer { loading ->
            loading?.let {
                if (it){
                    cityDailyLoading.visibility = View.VISIBLE
                    recyclerView.visibility = View.GONE
                }else{
                    cityDailyLoading.visibility = View.GONE
                }
            }
        })

    }

    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<out String>, grantResults: IntArray
    ) {
        if (requestCode == REQUEST_CODE) {
            if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                location = SimpleLocation(context)
                latitude = String.format("%.6f", location?.latitude)
                longitude = String.format("%.6f", location?.longitude)
                Log.e("LAT", "" + latitude)
                Log.e("LONG", "" + longitude)

                viewModel.getCityDailyWeatherFromGps(latitude!!,longitude!!,Constant.CNT,Constant.METRIC)

            } else {
                Toast.makeText(context, "İzin vereydin de konumunu bulaydık :P", Toast.LENGTH_LONG)
                    .show()
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

}
