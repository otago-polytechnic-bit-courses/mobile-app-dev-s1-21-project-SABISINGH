package op.mobile.app.dev.singhs2.travelling.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://gist.githubusercontent.com/"

object ServiceInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val retrofitService: IGitHubCountries by lazy {
        retrofit.create(IGitHubCountries::class.java)
    }
}