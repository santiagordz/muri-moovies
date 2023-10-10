package com.murimovies.framework.adapters.viewholders

import android.content.Context
import android.util.Log
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.murimovies.databinding.ItemMovieBinding
import com.murimovies.domain.model.Movie
import com.murimovies.utils.Constants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieListViewHolder(private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {

    /**
     * Bind the data to the view
     * @param item The movie to bind
     * @param context The context of the view
     * @return Unit
     */

    fun bind(item: Movie, context: Context) {
        binding.title.text = item.title
        binding.overview.text = item.overview
        setImage(item, context, binding.IVPhoto, binding.root.context)
    }

    /**
     * Set the image of the movie
     * @param movie The movie to bind
     * @param context The context of the view
     * @param imageView The image view to set the image
     * @param appContext The context of the app
     * @return Unit
     */

    private fun setImage(movie: Movie, context: Context, imageView: ImageView, appContext: Context) {
        val urlImage = Constants.POSTER_URL + movie.poster_path
        Log.d("UrlImage", urlImage)

        val requestOptions = RequestOptions()
            .centerCrop()
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .fitCenter()
            .priority(Priority.HIGH)

        // Load the image on the main thread using the appContext
        Glide.with(appContext).load(urlImage)
            .apply(requestOptions)
            .into(imageView)
    }
}
