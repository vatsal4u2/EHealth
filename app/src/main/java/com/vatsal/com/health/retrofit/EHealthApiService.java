package com.vatsal.com.health.retrofit;

import com.vatsal.com.health.models.PatientResponseInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by vatsalpatel on 2017-11-25.
 */

public interface EHealthApiService {
    @GET("Patient")
    Call<PatientResponseInfo> getPatience(@Query("_count") int count);
}
