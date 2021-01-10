package com.example.muvi.ui.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions.bitmapTransform
import com.example.muvi.R
import com.example.muvi.utils.ApiConfig
import jp.wasabeef.glide.transformations.BlurTransformation

@BindingAdapter("drawable")
fun loadImage(view: ImageView, drawable: Int) {
    Glide.with(view.context)
        .load(drawable)
        .error(R.drawable.ic_movie_error)
        .into(view)
}

@BindingAdapter("image")
fun loadUrlImage(view: ImageView, urlImage: String?) {
    Glide.with(view.context)
        .load(ApiConfig.getUrlImage(urlImage))
        .error(R.drawable.ic_movie_error)
        .into(view)
}

@BindingAdapter("imageBlurry")
fun loadUrlImageBlurry(view: ImageView, urlImage: String?) {
    Glide.with(view.context)
        .load(ApiConfig.getUrlImage(urlImage))
        .apply(bitmapTransform(BlurTransformation(50)))
        .error(R.drawable.ic_movie_error)
        .into(view)
}
