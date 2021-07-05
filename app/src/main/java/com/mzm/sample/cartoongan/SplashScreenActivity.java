package com.mzm.sample.cartoongan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.muddzdev.styleabletoast.StyleableToast;


public class SplashScreenActivity extends AppCompatActivity {
    int delayTime=4000;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        img=findViewById(R.id.imageView2);
        //StyleableToast.makeText(SplashScreenActivity.this, "welcome!!", Toast.LENGTH_LONG, R.style.mytoast).show();
        YoYo.with(Techniques.BounceInDown).duration(4000).playOn(img);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent homeIntent= new Intent(SplashScreenActivity.this,SignInActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },delayTime);
    }
}