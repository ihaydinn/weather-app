package com.ismailhakkiaydin.weather.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

class CityDailyResponse() : Parcelable {
    @SerializedName("list")
    var list: List<Forecast>? =
        null
    @SerializedName("count")
    var count = 0
    @SerializedName("cod")
    var cod: String? = null
    @SerializedName("message")
    var message: String? = null

    constructor(parcel: Parcel) : this() {
        count = parcel.readInt()
        cod = parcel.readString()
        message = parcel.readString()
    }

    class Forecast() : Parcelable {
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

        constructor(parcel: Parcel) : this() {
            dt = parcel.readInt()
            name = parcel.readString()
            id = parcel.readInt()
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeInt(dt)
            parcel.writeString(name)
            parcel.writeInt(id)
        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<Forecast> {
            override fun createFromParcel(parcel: Parcel): Forecast {
                return Forecast(parcel)
            }

            override fun newArray(size: Int): Array<Forecast?> {
                return arrayOfNulls(size)
            }
        }

    }

    class Weather() : Parcelable {
        @SerializedName("icon")
        var icon: String? = null
        @SerializedName("description")
        var description: String? = null
        @SerializedName("main")
        var main: String? = null
        @SerializedName("id")
        var id = 0

        constructor(parcel: Parcel) : this() {
            icon = parcel.readString()
            description = parcel.readString()
            main = parcel.readString()
            id = parcel.readInt()
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeString(icon)
            parcel.writeString(description)
            parcel.writeString(main)
            parcel.writeInt(id)
        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<Weather> {
            override fun createFromParcel(parcel: Parcel): Weather {
                return Weather(parcel)
            }

            override fun newArray(size: Int): Array<Weather?> {
                return arrayOfNulls(size)
            }
        }

    }

    class Clouds() : Parcelable {
        @SerializedName("all")
        var all = 0

        constructor(parcel: Parcel) : this() {
            all = parcel.readInt()
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeInt(all)
        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<Clouds> {
            override fun createFromParcel(parcel: Parcel): Clouds {
                return Clouds(parcel)
            }

            override fun newArray(size: Int): Array<Clouds?> {
                return arrayOfNulls(size)
            }
        }

    }

    class Sys {
        @SerializedName("country")
        var country: String? = null

    }

    class Wind() : Parcelable {
        @SerializedName("deg")
        var deg = 0
        @SerializedName("speed")
        var speed = 0.0

        constructor(parcel: Parcel) : this() {
            deg = parcel.readInt()
            speed = parcel.readDouble()
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeInt(deg)
            parcel.writeDouble(speed)
        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<Wind> {
            override fun createFromParcel(parcel: Parcel): Wind {
                return Wind(parcel)
            }

            override fun newArray(size: Int): Array<Wind?> {
                return arrayOfNulls(size)
            }
        }

    }

    class Main() : Parcelable {
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

        constructor(parcel: Parcel) : this() {
            humidity = parcel.readInt()
            pressure = parcel.readInt()
            tempMax = parcel.readDouble()
            tempMin = parcel.readDouble()
            feelsLike = parcel.readDouble()
            temp = parcel.readDouble()
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeInt(humidity)
            parcel.writeInt(pressure)
            parcel.writeDouble(tempMax)
            parcel.writeDouble(tempMin)
            parcel.writeDouble(feelsLike)
            parcel.writeDouble(temp)
        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<Main> {
            override fun createFromParcel(parcel: Parcel): Main {
                return Main(parcel)
            }

            override fun newArray(size: Int): Array<Main?> {
                return arrayOfNulls(size)
            }
        }

    }

    class Coord {
        @SerializedName("lon")
        var lon = 0.0
        @SerializedName("lat")
        var lat = 0.0

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(count)
        parcel.writeString(cod)
        parcel.writeString(message)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CityDailyResponse> {
        override fun createFromParcel(parcel: Parcel): CityDailyResponse {
            return CityDailyResponse(parcel)
        }

        override fun newArray(size: Int): Array<CityDailyResponse?> {
            return arrayOfNulls(size)
        }
    }
}