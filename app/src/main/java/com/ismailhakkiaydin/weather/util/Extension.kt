package com.ismailhakkiaydin.weather.util

import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import java.text.SimpleDateFormat
import java.time.Instant
import java.time.format.DateTimeFormatter
import java.util.*


fun dateConverter(): String {
    var date = Calendar.getInstance().time
    var converter = SimpleDateFormat("EEE, d MMM yyyy", Locale("en"))
    var convertedDate = converter.format(date)

    return convertedDate
}

fun timeConverter(time: Long): String {
    var converter = SimpleDateFormat("hh:mm a")
    var convertedTime = converter.format(Date(time*1000))

    return convertedTime
}

fun dayConverter(time: Long) : String{
    var converter = SimpleDateFormat("EEE, d MMM yyyy hh:mm a")
    var convertedDay = converter.format(Date(time*1000))

    return convertedDay
}
