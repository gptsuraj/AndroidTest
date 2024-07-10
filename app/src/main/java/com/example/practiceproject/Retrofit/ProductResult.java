package com.example.practiceproject.Retrofit;

import com.google.gson.annotations.SerializedName;

public class ProductResult {

    @SerializedName("id")
    int id;
    @SerializedName("title")
    String title;
    @SerializedName("image")
    String productImage;

    public ProductResult(int id, String title, String productImage) {
        this.id = id;
        this.title = title;
        this.productImage = productImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
}

