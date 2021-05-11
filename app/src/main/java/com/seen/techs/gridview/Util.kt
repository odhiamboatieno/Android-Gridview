package com.seen.techs.gridview

import android.graphics.drawable.Drawable
import androidx.core.graphics.drawable.toDrawable

fun converter(st: String): Int {

    var imgSetter = R.drawable.a.toInt()
    when (st) {
        "pineaple" -> imgSetter = R.drawable.pine
        "oranges"-> imgSetter = R.drawable.orange
        "bananas"-> imgSetter = R.drawable.bananas
        "mangoes" -> imgSetter = R.drawable.mango
        "tomatoes" -> imgSetter = R.drawable.tomatoes
        "avocado" -> imgSetter = R.drawable.avocado
    }
    return imgSetter.toInt()
}

fun pricer(st: String): String {

    var price = "90"

    when (st) {
        "pineaple" -> price = "90"
        "oranges"-> price = "50"
        "bananas"->  price = "60"
        "mangoes" ->  price = "25"
        "tomatoes" ->  price = "30"
        "avocado" -> price ="20"
    }
    return price
}


fun stocker(st: String): String {

    var inventory = "50"

    when (st) {
        "pineaple" -> inventory = "50"
        "oranges"-> inventory = "100"
        "bananas"->  inventory = "60"
        "mangoes" ->  inventory = "200"
        "tomatoes" ->  inventory = "1000"
        "avocado" -> inventory ="550"
    }
    return inventory
}