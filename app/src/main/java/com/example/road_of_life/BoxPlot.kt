package com.example.road_of_life

import krangl.*
import jetbrains.letsPlot.*
import jetbrains.letsPlot.geom.*

fun main() {
    val data = dataFrameOf("values", listOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)).addColumn("group") { "A" }
    val boxplot = letsPlot(data) { x = "group"; y = "values" } + geomBoxplot()
    boxplot.show()
}

class BoxPlot {
}