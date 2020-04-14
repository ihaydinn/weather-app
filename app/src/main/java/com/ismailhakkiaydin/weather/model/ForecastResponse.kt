package com.ismailhakkiaydin.weather.model
import com.google.gson.annotations.SerializedName


class ForecastResponse{
     @SerializedName("list")
     var list: List<Forecast>? = null

     class City {
         @SerializedName("sunset")
         var sunset = 0
         @SerializedName("sunrise")
         var sunrise = 0
         @SerializedName("timezone")
         var timezone = 0
         @SerializedName("population")
         var population = 0
         @SerializedName("country")
         var country: String? = null
         @SerializedName("coord")
         var coord: Coord? = null
         @SerializedName("name")
         var name: String? = null
         @SerializedName("id")
         var id = 0

     }

     class Coord {
         @SerializedName("lon")
         var lon = 0.0
         @SerializedName("lat")
         var lat = 0.0

     }

     class Forecast {
         @SerializedName("dt_txt")
         var dtTxt: String? = null
         @SerializedName("wind")
         var wind: Wind? = null
         @SerializedName("weather")
         var weather: List<Weather>? = null
         @SerializedName("main")
         var main: Main? = null
         @SerializedName("dt")
         var dt = 0

     }

     class Wind {
         @SerializedName("speed")
         var speed = 0.0

     }

     class Weather {
         @SerializedName("icon")
         var icon: String? = null
         @SerializedName("description")
         var description: String? = null
         @SerializedName("main")
         var main: String? = null
         @SerializedName("id")
         var id = 0

     }

     class Main {
         @SerializedName("temp_kf")
         var tempKf = 0.0
         @SerializedName("humidity")
         var humidity = 0
         @SerializedName("grnd_level")
         var grndLevel = 0
         @SerializedName("sea_level")
         var seaLevel = 0
         @SerializedName("pressure")
         var pressure = 0
         @SerializedName("temp_max")
         var tempMax = 0.0
         @SerializedName("temp_min")
         var tempMin = 0.0
         @SerializedName("feels_like")
         var feelsLike = 0.0
         @SerializedName("temp")
         var temp = 0.0

     }
 }