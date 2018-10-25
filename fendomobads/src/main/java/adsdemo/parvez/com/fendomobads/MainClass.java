package adsdemo.parvez.com.fendomobads;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainClass {

    private Context context;

    public MainClass(Context context) {

        this.context = context;
    }

    public void fendonusAdMob() {

        ApiInterface apiInterface;
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        Call<AddInfo> call = apiInterface.getAddInfo("app-12345678");
        call.enqueue(new Callback<AddInfo>() {
            @Override
            public void onResponse(Call<AddInfo> call, Response<AddInfo> response) {
                AddInfo addInfo = response.body();

                ShowAdDialog alert = new ShowAdDialog();
                alert.showDialog((Activity) context, addInfo);
            }

            @Override
            public void onFailure(Call<AddInfo> call, Throwable t) {

                Toast.makeText(context, "" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }

        });
    }
}
