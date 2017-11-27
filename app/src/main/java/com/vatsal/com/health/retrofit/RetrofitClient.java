package com.vatsal.com.health.retrofit;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by vatsalpatel on 2017-11-25.
 */

public class RetrofitClient {

    private static final String BASE_URL = "http://fhirtest.uhn.ca/baseDstu3/";
    private static Retrofit retrofit = null;

    public static EHealthApiService getClient() {
        if (retrofit == null) {
            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .writeTimeout(2, TimeUnit.MINUTES)
                    .readTimeout(2, TimeUnit.MINUTES)
                    .addInterceptor(new LoggingInterceptor())
                    .retryOnConnectionFailure(true)
                    .build();


            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(EHealthApiService.class);
    }
}
