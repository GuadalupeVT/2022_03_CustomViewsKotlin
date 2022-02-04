package com.example.a03_customviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //val cover = findViewById<AspectRatioImageView>(R.id.cover)
        //cover.ratio=1.5f

        //Mandar a llamar pelicula
        val movie = findViewById<MovieView>(R.id.movie_avengers)
        movie.setMovie(Movie("Batman","https://th.bing.com/th/id/OIP.AweUA_IuT_iRmzDcR5PLPQHaKB?pid=ImgDet&rs=1"))
    }
}