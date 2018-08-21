package com.tkachuk.kedditbysteps

import java.text.DateFormat
import java.util.*

fun Long.getTime(): String {
    return DateFormat.getDateInstance(DateFormat.SHORT).format(Date(this))
}