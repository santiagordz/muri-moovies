package com.murimovies.domain.usecase

import com.murimovies.data.repository.MovieRepository

class GetMovieList {
    private val repository = MovieRepository()

    /**
     * Get the list of popular movies from the API
     * @param limit: The number of movies to get
     * @return MovieResponse: The response from the API
     */
    suspend operator fun invoke(limit: Int) = repository.getMovieList(limit)
}