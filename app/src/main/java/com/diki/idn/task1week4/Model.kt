package com.diki.idn.task1week4

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Model(
    var title: String,
    var desc: String
) : Parcelable


