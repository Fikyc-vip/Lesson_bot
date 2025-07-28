package Lesson1

import android.util.Log

fun main() {

    val oneHour = 60
    val totalSeconds = 6480

    val hours = totalSeconds / (oneHour*oneHour)
    val remainingAfterHours = totalSeconds % (oneHour*oneHour)

    val minutes = remainingAfterHours / oneHour
    val seconds = remainingAfterHours % oneHour

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
    
}

