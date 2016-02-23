package com.pd.foldrebroser.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.pd.foldrebroser.R;
import com.pd.foldrebroser.until.SharePreferenceUntil;

public class StartActivity extends Activity {
         boolean  mFirstuser = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_start);

       if(SharePreferenceUntil.PREFERENCE_FIRST_USE)
       {    SharePreferenceUntil.PREFERENCE_FIRST_USE =false;
           Intent intent = new Intent(StartActivity.this,WelcomActivity.class);
           startActivity(intent);
           finish();

       }
        else
       {    new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent intent = new Intent(StartActivity.this,MainActivity.class);
               overridePendingTransition(R.anim.fade,R.anim.hold);
               finish();

           }
       },15000);







       }


    }
}
