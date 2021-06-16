package op.mobile.app.dev.singhs2.travelling.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class QuestionNumber11 (
    val image: String,
    val question_type: String,
    val question: String,
    val option: Option,
    val answer: String
) : Parcelable