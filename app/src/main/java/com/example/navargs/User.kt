package com.example.navargs

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User (
    var id: Int,
    var name: String,
    var externalIdentifier: Int,
    val type: UserType,
    var responsibleUser: Guardian?
): Parcelable