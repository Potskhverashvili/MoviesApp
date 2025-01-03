package com.example.moviesapp.request

import com.example.moviesapp.utils.Credentials
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitInstance {

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://www.themoviedb.org")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}