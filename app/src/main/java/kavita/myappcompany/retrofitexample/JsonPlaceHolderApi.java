package kavita.myappcompany.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("random_ten")
    Call<List<Post>> getPosts();
}
