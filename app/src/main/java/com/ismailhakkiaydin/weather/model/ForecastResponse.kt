package com.ismailhakkiaydin.weather.model
import com.google.gson.annotations.SerializedName


 data class ForecastResponse(
    @SerializedName("list")
    var list: List<Forecast>? = null
) {
    data class Forecast(
        @SerializedName("dt")
        var dt: Int,
        @SerializedName("main")
        var main: Main,
        @SerializedName("weather")
        var weather: List<Weather>,
        @SerializedName("wind")
        var wind: Wind,
        @SerializedName("dt_txt")
        var dtTxt: String
    ) {
        data class Main(
            @SerializedName("temp")
            var temp: Double,
            @SerializedName("feels_like")
            var feelsLike: Double,
            @SerializedName("temp_min")
            var tempMin: Double,
            @SerializedName("temp_max")
            var tempMax: Double,
            @SerializedName("pressure")
            var pressure: Int,
            @SerializedName("sea_level")
            var seaLevel: Int,
            @SerializedName("grnd_level")
            var grndLevel: Int,
            @SerializedName("humidity")
            var humidity: Int,
            @SerializedName("temp_kf")
            var tempKf: Double
        )

        data class Weather(
            @SerializedName("main")
            var main: String,
            @SerializedName("description")
            var description: String,
            @SerializedName("icon")
            var icon: String
        )

        data class Wind(
            @SerializedName("speed")
            var speed: Double
        )

    }

}