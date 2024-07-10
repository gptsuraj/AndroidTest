package com.example.practiceproject.Retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {

@GET("products")
    Call<List<ProductResult>> getProducts();

//    @POST("E1Pn7khWG")
//    Call<List<Hospitals>> getHospitalsList();

}
