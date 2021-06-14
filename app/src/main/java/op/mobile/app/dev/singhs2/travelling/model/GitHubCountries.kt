package op.mobile.app.dev.singhs2.travelling.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class GitHubCountries(
    val id: String,
    val name: String,
    val capital: String,
    val flagImg: String,
    val quiz: @RawValue List<Quiz>
) : Parcelable