package op.mobile.app.dev.singhs2.travelling.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Option (
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String
) : Parcelable