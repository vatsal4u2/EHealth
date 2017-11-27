package com.vatsal.com.health.retrofit;

import android.support.annotation.NonNull;
import android.util.Log;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Created by vatsalpatel on 2017-11-25.
 */

class LoggingInterceptor implements Interceptor {
    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Request authorizedRequest = chain.request().newBuilder()
                .addHeader("Accept-Charset", "utf-8")
                .addHeader("Accept", "application/fhir+xml;q=1.0, application/fhir+json;q=1.0, application/xml+fhir;q=0.9, application/json+fhir;q=0.9")
                .addHeader("User-Agent", "HAPI-FHIR/3.1.0 (FHIR Client; FHIR 3.0.1/DSTU3; apache)")
                .addHeader("Accept-Encoding", "utf-8")
                .build();

        Response response = chain.proceed(authorizedRequest);
        ResponseBody responseBody = response.peekBody(Long.MAX_VALUE);
        Log.e("Response", "intercept: " + responseBody.string());
        return response;
    }
}
