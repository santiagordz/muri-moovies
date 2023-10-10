package com.murimovies.data.remote

import com.murimovies.domain.model.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPIService {
    /**
     * Get the list of popular movies from the API
     * @param page: The page number to get
     * @return MovieResponse: The response from the API
     */
    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("page") page: Int
    ): MovieResponse
}