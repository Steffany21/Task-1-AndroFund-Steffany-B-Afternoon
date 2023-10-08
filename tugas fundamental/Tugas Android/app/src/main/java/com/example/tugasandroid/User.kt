package com.example.tugasandroid

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class User (
    val nama:String,
    val ntelepon:String,
    val email:String
):Parcelable