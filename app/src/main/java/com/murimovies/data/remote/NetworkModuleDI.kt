package com.murimovies.data.remote

import com.murimovies.utils.Constants
import jp.wasabeef.glide.transformations.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkModuleDI {

    private val gsonFactory: GsonConverterFactory = GsonConverterFactory.create()

    /**
     * Create an OkHttpClient with an interceptor to add the API key to the request
     * @return OkHttpClient: The client to make the API calls
     * @see Constants.API_KEY
     */
    private val okHttpClient: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor { chain ->
            val request = chain.request().newBuilder()
                .addHeader("Authorization", "Bearer ${Constants.API_KEY}")
                .build()
            chain.proceed(request)
        }
        .build()

    /**
     * Create a Retrofit instance with the base URL, the Gson converter and the OkHttpClient
     * @return MovieAPIService: The service to make the API calls
     */

    operator fun invoke(): MovieAPIService {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(gsonFactory)
            .client(okHttpClient)
            .build()
            .create(MovieAPIService::class.java)
    }
}
