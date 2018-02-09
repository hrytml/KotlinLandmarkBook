package com.io.huriyeedu.kotlinlandmarkbook

import android.graphics.Bitmap

/**
 * Created by apple on 10.02.2018.
 */
class Globals {

    companion object Chosen {
        var chosenImage : Bitmap? = null
        fun returnImage():Bitmap {
            return chosenImage!!
        }
    }
}