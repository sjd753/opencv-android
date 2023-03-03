package com.sjd.opencv_android

import org.opencv.android.OpenCVLoader

object OpencvImpl {

    fun init() {
        if (!OpenCVLoader.initDebug()) {
            // Handle initialization error
            OpenCVLoader.initDebug()
        }
    }
}