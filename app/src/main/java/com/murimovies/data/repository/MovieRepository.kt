package com.murimovies.data.repository

import android.util.Log
import com.murimovies.data.remote.MovieAPIClient
import com.murimovies.domain.model.MovieResponse

class MovieRepository {
    private val api = MovieAPIClient()

    /**
     * Get the list of popular movies from the API
     * @param limit: The number of movies to get
     * @return MovieResponse: The response from the API
     */
    suspend fun getMovieList(limit: Int): MovieResponse?{
        val result = api.getMovieList(limit)
        Log.d("SalidaRepository", result.toString())
        return result
    }
}