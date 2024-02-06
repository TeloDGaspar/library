package com.example.mylibrary

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat

class DataTransferImpl(private val context: Context) : DataTransfer {
    override fun getPassData(): List<Int> {
        return listOf(R.drawable.rsebmwtheme_media_cover_dummy)
    }

    override fun getPassData2(): Response {
        return Response("name", "description")
    }

    override fun getPassData3(): Drawable {
        return ContextCompat.getDrawable(context, R.drawable.rsebmwtheme_media_cover_dummy)!!
    }
}
