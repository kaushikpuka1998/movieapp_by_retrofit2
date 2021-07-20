package com.kgstriversmoviejava.movie_app.request;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.kgstriversmoviejava.movie_app.Model.MovieModel;

import java.util.List;

public class MovieApiClient {

    private MutableLiveData<List<MovieModel>> mMovies;

    private static MovieApiClient instance;

    public static MovieApiClient getInstance(){


        if(instance == null)
        {
            instance = new MovieApiClient();
        }


        return instance;
    }

    public MovieApiClient() {
        mMovies = new MutableLiveData<>();
    }

    public LiveData<List<MovieModel>>getMovies()
    {
        return mMovies;
    }
}