package com.example.mylibrary

import android.graphics.drawable.Drawable

interface DataTransfer {
    fun getPassData(): List<Int>

    fun getPassData2(): Response

    fun getPassData3(): Drawable
}

data class Response(val name: String, val desc: String)
