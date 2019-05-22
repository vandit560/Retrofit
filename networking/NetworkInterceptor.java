package com.david.luharsamaj.networking;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class NetworkInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder builder = request.newBuilder();
//                .header("Authorization", "your Tokan");
        Request request1 = builder.build();
        return chain.proceed(request1);
    }
}
