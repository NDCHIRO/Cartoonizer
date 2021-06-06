package com.mzm.sample.cartoongan;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
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

public class StyleGAN2CartoonActivity extends AppCompatActivity {
    ImageView realFaceImView;
    ImageView styleGan2imView;
    TextView textView2;
    Bitmap bitmap;

    @SuppressLint("ResourceType")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style_g_a_n2_cartoon);

        realFaceImView = findViewById(R.id.realFaceImageView);
        styleGan2imView = findViewById(R.id.styleGAN2ImageView);
        textView2 = findViewById(R.id.textView2);
        /*try {
            URL url = new URL("https://api.deepai.org/api/toonify");
            HttpURLConnection c = (HttpURLConnection) url.openConnection();
            c.setDoInput(true);
            c.setRequestMethod("POST");
            c.setDoOutput(true);
            c.connect();
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.high_res_face);
            OutputStream output = c.getOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 50, output);
            output.close();

            Scanner result = new Scanner(c.getInputStream());
            String response = result.nextLine();
            Log.e("ImageUploader", "Error uploading image: " + response);
            textView2.setText("ImageUploader"+ "Error uploading image: " + response);
            result.close();
        } catch (IOException e) {
            Log.e("ImageUploader", "Error uploading image", e);
        }*/

// Add the request to the RequestQueue.
        //queue.add(stringRequest);
        //establish connection
        /*URL url = null;
        try {
            url = new URL("https://api.deepai.org/api/toonify");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");

            Map<String, String> parameters = new HashMap<>();
            parameters.put("param1", "val");

            con.setDoOutput(true);
            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
            out.flush();
            out.close();

            con.setRequestProperty("Content-Type", "application/json");

            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/
    }
}



