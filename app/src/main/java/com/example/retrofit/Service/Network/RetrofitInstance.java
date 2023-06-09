package com.example.retrofit.Service.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static Retrofit retrofit;
    private static String Base_url="https://cricket.sportmonks.com/api/v2.0/";

    public static Retrofit getRetrofit()
    {
        if(retrofit==null)
            retrofit=new Retrofit.Builder().baseUrl(Base_url).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }
}
