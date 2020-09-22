package com.anwesh.uiprojects.openboxmoverview

/**
 * Created by anweshmishra on 23/09/20.
 */

import android.content.Context
import android.app.Activity
import android.view.View
import android.view.MotionEvent
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Color

val colors : Array<Int> = arrayOf(
        "#F44336",
        "#009688",
        "#2196F3",
        "#4CAF50",
        "#FFC107"
).map({Color.parseColor(it)}).toTypedArray()
val parts : Int = 3
val scGap : Float = 0.02f / parts
val sizeFactor : Float = 8.9f
val strokeFactor : Float = 90f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")
