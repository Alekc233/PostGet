package com.example.user.postget.Retrofit;

import com.example.user.postget.Model.Post;
import io.reactivex.Observable;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPI {
    @GET("posts")
    Observable<List<Post>> getPosts();
}
