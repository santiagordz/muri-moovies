package com.murimovies.domain.model

/**
 * Data class that represents the response from the API
 * @property page: The page number to get
 * @property results: The list of movies
 * @property total_pages: The total number of pages
 * @property total_results: The total number of results
 */

data class MovieResponse(
    val page: Int,
    val results: ArrayList<Movie>,
    val total_pages: Int,
    val total_results: Int
)