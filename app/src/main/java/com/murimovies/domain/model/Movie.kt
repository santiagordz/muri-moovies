package com.murimovies.domain.model

/**
 * Data class that represents the response from the API
 * @property adult: Indicates if the movie is for adults
 * @property backdrop_path: The path to the backdrop image
 * @property genre_ids: The list of genres
 * @property id: The id of the movie
 * @property original_language: The original language of the movie
 * @property original_title: The original title of the movie
 * @property overview: The overview of the movie
 * @property popularity: The popularity of the movie
 * @property poster_path: The path to the poster image
 * @property release_date: The release date of the movie
 * @property title: The title of the movie
 * @property video: Indicates if the movie has video
 * @property vote_average: The average vote of the movie
 * @property vote_count: The number of votes of the movie
 */

data class Movie(
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: List<Int>,
    val id: Int,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int
)