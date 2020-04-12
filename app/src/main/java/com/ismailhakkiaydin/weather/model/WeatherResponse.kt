package com.ismailhakkiaydin.weather.model

import com.google.gson.annotations.SerializedName

class WeatherResponse {
    @SerializedName("cod")
    var cod = 0
    @SerializedName("name")
    var name: String? = null
    @SerializedName("id")
    var ıd = 0
    @SerializedName("timezone")
    var timezone = 0
    @SerializedName("sys")
    var sys: Sys? = null
    @SerializedName("dt")
    var dt = 0
    @SerializedName("clouds")
    var clouds: Clouds? = null
    @SerializedName("wind")
    var wind: Wind? = null
    @SerializedName("visibility")
    var visibility = 0
    @SerializedName("main")
    var main: Main? = null
    @SerializedName("base")
    var base: String? = null
    @SerializedName("weather")
    var weather: List<Weather>? = null
    @SerializedName("coord")
    var coord: Coord? = null

    class Sys {
        @SerializedName("sunset")
        var sunset = 0
        @SerializedName("sunrise")
        var sunrise = 0
        @SerializedName("country")
        var country: String? = null
        @SerializedName("id")
        var ıd = 0
        @SerializedName("type")
        var type = 0

    }

    class Clouds {
        @SerializedName("all")
        var all = 0

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

    class Weather {
        @SerializedName("icon")
        var icon: String? = null
        @SerializedName("description")
        var description: String? = null
        @SerializedName("main")
        var main: String? = null
        @SerializedName("id")
        var ıd = 0

    }

    class Coord {
        @SerializedName("lat")
        var lat = 0.0
        @SerializedName("lon")
        var lon = 0.0

    }
}