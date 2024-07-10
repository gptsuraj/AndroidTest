package com.example.practiceproject;

import static com.example.practiceproject.Retrofit.RetrofitClient.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.practiceproject.Retrofit.ApiService;
import com.example.practiceproject.Retrofit.ProductResult;
import com.example.practiceproject.Retrofit.RecyclerViewAdapter;
import com.example.practiceproject.Retrofit.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView rvProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        rvProducts = findViewById(R.id.rvProduct);
        getProducts();
    }
    private void getProducts() {
        ApiService apiService = RetrofitClient.getApiClient().create(ApiService.class);
        Call<List<ProductResult>> apiCall = apiService.getProducts();
        apiCall.enqueue(new Callback<List<ProductResult>>() {
            @Override
            public void onResponse(Call<List<ProductResult>> call, Response<List<ProductResult>> response) {
                List<ProductResult> productResults = response.body();
                Toast.makeText(RecyclerViewActivity.this, "Get Products", Toast.LENGTH_SHORT).show();
                setAdapter(productResults);
            }

            @Override
            public void onFailure(Call<List<ProductResult>> call, Throwable t) {
                Toast.makeText(RecyclerViewActivity.this, "Error", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void setAdapter(List<ProductResult> productResults) {
        rvProducts.setLayoutManager(new LinearLayoutManager(this));
        RecyclerViewAdapter recyclerViewAdapter =new RecyclerViewAdapter(this,productResults);
        rvProducts.setAdapter(recyclerViewAdapter);
    }
}