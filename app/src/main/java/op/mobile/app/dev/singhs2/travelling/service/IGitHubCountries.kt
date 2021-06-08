package op.mobile.app.dev.singhs2.travelling.service

import op.mobile.app.dev.singhs2.travelling.model.GitHubCountries
import retrofit2.http.GET

interface   IGitHubCountries {
    @GET("SABISINGH/269fadb21b533d04649bcf5db17dfa64/raw")
    suspend fun getResponse(): List<GitHubCountries>
}