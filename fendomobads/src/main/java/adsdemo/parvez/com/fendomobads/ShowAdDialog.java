package adsdemo.parvez.com.fendomobads;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ShowAdDialog {

    private String isClicked = "";

    public void showDialog(final Activity activity, final AddInfo addInfo){

        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.alert_dialog_layout);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));




        ImageView imageView = dialog.findViewById(R.id.imageView);
        Picasso.with(activity.getBaseContext()).load(addInfo.getImage()).into(imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

     isClicked = "yes";
     saveDataToServer(activity,addInfo,dialog,isClicked);
            }
        });
        Button dialogBtn_cancel = (Button) dialog.findViewById(R.id.canelButton);

        dialogBtn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               isClicked = "no";
               saveDataToServer(activity,addInfo,dialog,isClicked);
            }
        });

        dialog.show();
    }


    public void saveDataToServer(final Activity activity, final AddInfo addInfo , final Dialog dialog, final String isClicked){
        ApiInterface apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        Call<Void> call = apiInterface.saveData(
                addInfo.getPublisherId(),
                addInfo.getPackageName(),
                addInfo.getAppId(),
                addInfo.getAddUnitId(),
                addInfo.getAdverserId(),
                addInfo.getAddId(),
                addInfo.getAddType(),
                addInfo.getImage(),
                addInfo.getLink(),
                addInfo.getCpc(),
                addInfo.getRemainingBalance(),
                addInfo.getUserName(),
                isClicked
        );
        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (isClicked.equals("yes")){

                    Intent viewIntent =
                            new Intent("android.intent.action.VIEW",
                                    Uri.parse(addInfo.getLink()));
                    activity.startActivity(viewIntent);
                    dialog.dismiss();
                }else{
                    dialog.dismiss();
                }
            }


            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                Toast.makeText(activity, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

