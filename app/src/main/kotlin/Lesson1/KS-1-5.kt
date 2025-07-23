package Lesson1

import android.util.Log

fun main() {
    val totalSeconds = 6480

    val hours = totalSeconds / 3600
    val remainingAfterHours = totalSeconds % 3600

    val minutes = remainingAfterHours / 60
    val seconds = remainingAfterHours % 60

    val formattedTime = "%02d:%02d:%02d".format(hours, minutes, seconds)
    println("Время полёта: $formattedTime")
    
}

