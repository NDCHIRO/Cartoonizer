package com.mzm.sample.cartoongan;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class StyleGAN2CartoonActivity extends AppCompatActivity  {
    ImageView realFaceImView;
    ImageView styleGan2imView;
    Button btnToonify;
    Bitmap bitmap;
    int progressbarstatus;

    ProgressBar progressBar;
    Toolbar toolbar;
    @SuppressLint("ResourceType")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style_g_a_n2_cartoon);

        realFaceImView = findViewById(R.id.realFaceImageView);
        styleGan2imView = findViewById(R.id.styleGAN2ImageView);
        btnToonify = findViewById(R.id.btnToonify);
        progressBar=findViewById(R.id.progressBar);
        progressBar.setVisibility(View.INVISIBLE);
        toolbar=findViewById(R.id.toolbar4);

        setSupportActionBar(toolbar);
        //prgressBarInit();


        btnToonify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                styleGan2imView.setImageDrawable(null);
                Change();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.style_gan_2_menu, menu);
        return true;
    }

    private void prgressBarInit() {
        progressBar.setProgress(0);
        progressBar.setMax(50);
        progressbarstatus = 0;
    }

    private void Change() {
        prgressBarInit();
        progressBar.setVisibility(View.VISIBLE);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                progressBar.incrementProgressBy(10);
                if(progressBar.getMax()==50)
                    progressBar.setVisibility(View.INVISIBLE);

                // Do something after 5s = 5000ms
                styleGan2imView.setImageDrawable(getResources().getDrawable(R.drawable.output_fhd));
            }
        }, 5000);

    }




}


class AppConfig {
    private static String BASE_URL = "'https://api.deepai.org/api/toonify";
    static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(AppConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}

class MyAsyncTask  extends AsyncTask<String, String, String> {
    Context context;
    String result;
    ProgressDialog progressDialog;
    public MyAsyncTask (Context context) {
        this.context = context;
    }
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog = ProgressDialog.show(context,
                "Progress Dialog", null);
    }
    @Override
    protected String doInBackground(String... args) {
        int value = Integer.parseInt(args[0]);
        for(int i = 0; i <= value ;i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                Log.v("Error: ", e.toString());
            }
            result = "Please wait for " + (value - i ) + " seconds";
            publishProgress(result);
        }
        return null;
    }
    @Override
    protected void onProgressUpdate(String... text) {
        progressDialog.setMessage(text[0]);
    }
    protected void onPostExecute(String result) {
        progressDialog.dismiss();
    }
}


class myTask extends AsyncTask<String, String, String> {
    @Override
    protected void onPreExecute() {

    };

    @Override
    protected String doInBackground(String... params) {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //progressbar.incrementProgressBy(10);
        }
        return "completed";
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);

    }

    @Override
    protected void onProgressUpdate(String... values) {

        super.onProgressUpdate(values);
    }
}




