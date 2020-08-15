package com.myogardener.moviesflash

import java.text.SimpleDateFormat
import java.util.*

fun toSimpleString(releasedDate: String): String {
var inputFormat= SimpleDateFormat(
"YYYY-MM-DD",
Locale.ENGLISH
)
   var outputFormat=SimpleDateFormat(
       "DD-MM-YYYY",
       Locale.getDefault()
   )
    var date=inputFormat.parse(releasedDate)
    return outputFormat.format(date)
}