package com.given.gd10_c_10561

import com.google.gson.annotations.SerializedName

class ResponseCreate(
    @SerializedName("status") val stt:Int,
    @SerializedName("error") val e:Boolean,
    @SerializedName("message") val pesan:String,
)