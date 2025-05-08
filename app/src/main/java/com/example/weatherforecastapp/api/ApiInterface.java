package com.example.weatherforecastapp.api;

import com.example.weatherforecastapp.model.WeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("weather")
    Call<WeatherResponse> getWeather(@Query("q") String city,
                                     @Query("appid") String key,
                                     @Query("units") String units);
}
