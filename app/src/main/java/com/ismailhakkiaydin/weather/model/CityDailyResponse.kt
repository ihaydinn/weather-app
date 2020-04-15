package com.ismailhakkiaydin.weather.model

import com.google.gson.annotations.SerializedName

class CityDailyResponse {
    @SerializedName("list")
    var list: List<Forecast>? =
        null
    @SerializedName("count")
    var count = 0
    @SerializedName("cod")
    var cod: String? = null
    @SerializedName("message")
    var message: String? = null

    class Forecast {
        @SerializedName("weather")
        var weather: List<Weather>? =
            null
        @SerializedName("clouds")
        var clouds: Clouds? = null
        @SerializedName("sys")
        var sys: Sys? = null
        @SerializedName("wind")
        var wind: Wind? = null
        @SerializedName("dt")
        var dt = 0
        @SerializedName("main")
        var main: Main? = null
        @SerializedName("coord")
        var coord: Coord? = null
        @SerializedName("name")
        var name: String? = null
        @SerializedName("id")
        var id = 0

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

    class Clouds {
        @SerializedName("all")
        var all = 0

    }

    class Sys {
        @SerializedName("country")
        var country: String? = null

    }

    class Wind {
        @SerializedName("deg")
        var deg = 0
        @SerializedName("speed")
        var speed = 0.0

    }

    class Main {
        @SerializedName("humidity")
        var humidity = 0
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

    class Coord {
        @SerializedName("lon")
        var lon = 0.0
        @SerializedName("lat")
        var lat = 0.0

    }
}