package com.example.characteer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import cn.pedant.SweetAlert.SweetAlertDialog;


public class MainActivity extends AppCompatActivity {

    Button btnTest, btnHelp, btnRes;
    private MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        music = MediaPlayer.create(this, R.raw.music);



        btnTest = findViewById(R.id.btn_test);
        btnHelp = findViewById(R.id.btn_Help);
        btnRes = findViewById(R.id.btn_resource);



        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent MyIntent = new Intent(MainActivity.this, Test.class);
                startActivity(MyIntent);

                music.start();
            }
        });

        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent MyIntent = new Intent(MainActivity.this, Help.class);
                startActivity(MyIntent);

            }
        });

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent MyIntent = new Intent(MainActivity.this, Webview.class);
                startActivity(MyIntent);

            }
        });


    }
    @Override
    public void onBackPressed() {

        exit_dialog();
    }


    public void exit_dialog() {

        new SweetAlertDialog(this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                .setTitleText("یعنی واقعا میخوای بری؟")
                .setCancelText("نوپ")
                .setConfirmText("بعله")
                .showCancelButton(true)
                .setCustomImage(R.drawable.ic_crying)
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {
                        finish();
                    }
                })
                .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {
                        sDialog.cancel();
                    }
                }).show();


    }
}
