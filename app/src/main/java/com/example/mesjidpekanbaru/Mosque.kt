package com.example.mesjidpekanbaru

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Mosque(
    val image: Int?,
    val name: String?,
    val location: String?,
) : Parcelable