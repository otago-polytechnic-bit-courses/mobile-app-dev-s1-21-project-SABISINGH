package op.mobile.app.dev.singhs2.travelling.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CountryQuiz (
    val id: Int,
    val name: String,
    val quizid: Int,
    val q1: QuestionNumber1,
    val q2: QuestionNumber2,
    val q3: QuestionNumber3,
    val q4: QuestionNumber4,
    val q5: QuestionNumber5,
    val q6: QuestionNumber6,
    val q7: QuestionNumber7,
    val q8: QuestionNumber8,
    val q9: QuestionNumber9,
    val q10: QuestionNumber10,
    val q11: QuestionNumber11,
    val q12: QuestionNumber12
) : Parcelable