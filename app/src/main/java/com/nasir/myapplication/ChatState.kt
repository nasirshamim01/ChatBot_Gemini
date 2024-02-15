package com.nasir.myapplication

import android.graphics.Bitmap
import com.nasir.myapplication.data.Chat

data class ChatState (

    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)