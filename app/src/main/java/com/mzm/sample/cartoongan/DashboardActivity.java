package com.mzm.sample.cartoongan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.mzm.sample.cartoongan.filters.camerafilter.FiltersActivity;
import com.mzm.sample.cartoongan.style_transfer.StyleTansferActivity;


public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    Button cartoonGANBtn;
    Button styleGAN2Btn;
    Button styleTransferBtn;
    Button filtersBtn;
    Button ARBtn;
    ImageView imageView;
    String TAG="1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        /*imageView = findViewById(R.id.imageViewCartoon);
        Glide.with(this)
                .load(R.drawable.redhair)
                .into(imageView);*/


        cartoonGANBtn=findViewById(R.id.cartoonGANBtn);
        cartoonGANBtn.setOnClickListener(this);

        styleGAN2Btn=findViewById(R.id.styleGAN2Btn);
        styleGAN2Btn.setOnClickListener(this);

        styleTransferBtn=findViewById(R.id.styleTransferBtn);
        styleTransferBtn.setOnClickListener(this);

        ARBtn=findViewById(R.id.AugRealityBtn);
        ARBtn.setOnClickListener(this);

        filtersBtn=findViewById(R.id.buttonFilters);
        filtersBtn.setOnClickListener(this);



    }



    @Override
    public void onClick(View v)
    {
        System.out.println("v is "+ v.getId());
        if (v.getId() == R.id.cartoonGANBtn) {
            Toast.makeText(DashboardActivity.this,"hi", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
                startActivity(intent);
        }
        else if (v.getId() == R.id.styleTransferBtn) {
            //Toast.makeText(DashboardActivity.this,"not implemented yet", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(DashboardActivity.this, StyleTansferActivity.class);
            startActivity(intent);
        }

        else if (v.getId() == R.id.styleGAN2Btn) {
            Toast.makeText(DashboardActivity.this, "styleGAN2 not implemented yet", Toast.LENGTH_SHORT).show();
                /*intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();*/
        }

        else if (v.getId() == R.id.AugRealityBtn) {
            Toast.makeText(DashboardActivity.this, "Augmented Reality not implemented yet", Toast.LENGTH_SHORT).show();
                /*intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();*/
        }

        else if (v.getId() == R.id.buttonFilters) {
            Intent intent = new Intent(DashboardActivity.this, FiltersActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(DashboardActivity.this, "function not implemented yet", Toast.LENGTH_SHORT).show();
        }

    }

}