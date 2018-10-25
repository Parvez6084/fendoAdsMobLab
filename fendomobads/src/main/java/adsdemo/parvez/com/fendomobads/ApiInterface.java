package adsdemo.parvez.com.fendomobads;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
public interface ApiInterface {

    @FormUrlEncoded
    @POST("action.php")
    Call<AddInfo> getAddInfo(@Field("publisher_id") String publisher_id);

    @FormUrlEncoded
    @POST("save_data.php")
    Call<Void> saveData(@Field("publisher_id") String publisher_id,
                        @Field("package_name") String package_name,
                        @Field("app_id") String app_id,
                        @Field("add_unit_id") String add_unit_id,
                        @Field("adverser_id") String adverser_id,
                        @Field("add_id") String add_id,
                        @Field("ad_type") String ad_type,
                        @Field("image") String image,
                        @Field("link") String link,
                        @Field("cpc") float cpc,
                        @Field("remaining_balance") float remaining_balance,
                        @Field("user_name") String user_name,
                        @Field("is_clicked") String is_clicked
    );
}
