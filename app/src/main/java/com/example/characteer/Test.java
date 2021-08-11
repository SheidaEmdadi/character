package com.example.characteer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Test extends AppCompatActivity {

    TextView txtQues, txtFirst, txtSecond, txtThird, txtFourth, txtFifth;

    int num = 1;
    int point = 0;


    private MediaPlayer bMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azmoon);

        bMusic = MediaPlayer.create(this, R.raw.button);



        txtQues = findViewById(R.id.txt_ques);
        txtFirst = findViewById(R.id.txt_First);
        txtSecond = findViewById(R.id.txt_second);
        txtThird = findViewById(R.id.txt_third);
        txtFourth = findViewById(R.id.txt_fourth);
        txtFifth = findViewById(R.id.txt_fifth);

        txtQues.setText(R.string.question1);
        txtFirst.setText(R.string.Gozine1_1);
        txtSecond.setText(R.string.Gozine1_2);
        txtThird.setText(R.string.Gozine1_3);
        txtFourth.setText(R.string.Gozine1_4);
        txtFifth.setText(R.string.Gozine1_5);




        txtFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                point++;
                bMusic.start();
                setًQuestion();
            }

        });

        txtSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                point = point + 2;
                bMusic.start();
                setًQuestion();
            }

        });

        txtThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                point = point + 3;
                bMusic.start();
                setًQuestion();
            }

        });

        txtFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                point = point + 4;
                bMusic.start();
                setًQuestion();

            }
        });

        txtFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                point = point + 5;
                bMusic.start();
                setًQuestion();

            }
        });


    }

    public void setًQuestion() {

        num++;


        switch (num) {

            case 1:

                break;
            case 2:
                txtQues.setText(R.string.question2);
                txtFirst.setText(R.string.Gozine2_1);
                txtSecond.setText(R.string.Gozine2_2);
                txtThird.setText(R.string.Gozine2_3);
                txtFourth.setText(R.string.Gozine2_4);
                txtFifth.setText(R.string.Gozine2_5);
                break;
            case 3:
                txtQues.setText(R.string.question3);
                txtFirst.setText(R.string.Gozine3_1);
                txtSecond.setText(R.string.Gozine3_2);
                txtThird.setText(R.string.Gozine3_3);
                txtFourth.setText(R.string.Gozine3_4);
                txtFifth.setText(R.string.Gozine3_5);
                break;
            case 4:
                txtQues.setText(R.string.question4);
                txtFirst.setText(R.string.Gozine4_1);
                txtSecond.setText(R.string.Gozine4_2);
                txtThird.setText(R.string.Gozine4_3);
                txtFourth.setText(R.string.Gozine4_4);
                txtFifth.setText(R.string.Gozine4_5);
                break;
            case 5:
                txtQues.setText(R.string.question5);
                txtFirst.setText(R.string.Gozine5_1);
                txtSecond.setText(R.string.Gozine5_2);
                txtThird.setText(R.string.Gozine5_3);
                txtFourth.setText(R.string.Gozine5_4);
                txtFifth.setText(R.string.Gozine5_5);
                break;
            case 6:
                txtQues.setText(R.string.question6);
                txtFirst.setText(R.string.Gozine6_1);
                txtSecond.setText(R.string.Gozine6_2);
                txtThird.setText(R.string.Gozine6_3);
                txtFourth.setText(R.string.Gozine6_4);
                txtFifth.setText(R.string.Gozine6_5);
                break;
            case 7:
                txtQues.setText(R.string.question7);
                txtFirst.setText(R.string.Gozine7_1);
                txtSecond.setText(R.string.Gozine7_2);
                txtThird.setText(R.string.Gozine7_3);
                txtFourth.setText(R.string.Gozine7_4);
                txtFifth.setText(R.string.Gozine7_5);
                break;
            case 8:
                txtQues.setText(R.string.question8);
                txtFirst.setText(R.string.Gozine8_1);
                txtSecond.setText(R.string.Gozine8_2);
                txtThird.setText(R.string.Gozine8_3);
                txtFourth.setText(R.string.Gozine8_4);
                txtFifth.setText(R.string.Gozine8_5);
                break;
            case 9:
                txtQues.setText(R.string.question9);
                txtFirst.setText(R.string.Gozine9_1);
                txtSecond.setText(R.string.Gozine9_2);
                txtThird.setText(R.string.Gozine9_3);
                txtFourth.setText(R.string.Gozine9_4);
                txtFifth.setText(R.string.Gozine9_5);
                break;
            case 10:
                txtQues.setText(R.string.question10);
                txtFirst.setText(R.string.Gozine10_1);
                txtSecond.setText(R.string.Gozine10_2);
                txtThird.setText(R.string.Gozine10_3);
                txtFourth.setText(R.string.Gozine10_4);
                txtFifth.setText(R.string.Gozine10_5);

                break;
            case 11:

                txtQues.setText(R.string.question11);
                txtFirst.setText(R.string.Gozine11_1);
                txtSecond.setText(R.string.Gozine11_2);
                txtThird.setText(R.string.Gozine11_3);
                txtFourth.setText(R.string.Gozine11_4);
                txtFifth.setText(R.string.Gozine11_5);
                break;
            case 12:

                txtQues.setText(R.string.question12);
                txtFirst.setText(R.string.Gozine12_1);
                txtSecond.setText(R.string.Gozine12_2);
                txtThird.setText(R.string.Gozine12_3);
                txtFourth.setText(R.string.Gozine12_4);
                txtFifth.setText(R.string.Gozine12_5);
                break;
            case 13:

                txtQues.setText(R.string.question13);
                txtFirst.setText(R.string.Gozine13_1);
                txtSecond.setText(R.string.Gozine13_2);
                txtThird.setText(R.string.Gozine13_3);
                txtFourth.setText(R.string.Gozine13_4);
                txtFifth.setText(R.string.Gozine13_5);
                break;
            default:
                Result();
                finish();


        }
    }

    public void Result() {


        if (point <= 21) {


            Intent myIntent = new Intent(getBaseContext(), Result.class);
            myIntent.putExtra("Res", "بدین معنی است که شما سوسن سفید هستید.مردم شما را به خاطر پشتکارتان،ازجــــان و دل مــــایــــه گــــذاشــتــــن تــــان و مـوفـقـیـت هـایـتـان تقدیر می کنند.اهداف مشخصی دارید و فکرتان بر کارتان متمرکز است.احتمالا فرزند اول خانواده هستید.احساستان را بسختی ابراز می کنید. یکی از مهم ترین نگرانی های شما این است که چگونه در برابر افراد مختلف ظاهر شوید.اندیشه هایتان کمی متمایل به بدبینی است.اعتماد به نفس دارید ولی در باطن گاهی به خود اعتماد ندارید.");
            startActivity(myIntent);


        } else if (point < 54 && point > 21) {

            Intent myIntent = new Intent(getBaseContext(), Result.class);
            myIntent.putExtra("Res", "بدین معنی است که شما یک گل رز هستید.کمی تیغ دارید ولی زیبایی های بسیاری دارید.حس شوخ طبعی دارید ولی از شنیدن جوک لذت می برید.احتمالا فرزند وسط خانواده هستید.مردم دوست دارند دوروبر شما باشند.خونگرم هستید.دوستان صمیمی بسیاری دارید.زندگی را بـا دیـد واقـع بـیـنـانـه می نگرید.آگاهید که زندگی از خوبی ها و بدی ها تشکیل شده است.قادرید شانس خودتان را با توجه به سـرمـایـه هـایـی کـه داریـد،امـتـحـان کـنید.سختکوش هستید و به اهدافتان پایبندید.دوست دارید خودتان باشید و این مساله به شما اعتماد به نفس می دهد. مشکل ترین مساله در زندگیتان یکنواخت بودن مسائل است.یکنواختی در هر مساله ای شما را آزار می دهد و باعث کسل شدن روحیه شما می شود.");
            startActivity(myIntent);

        } else if (point < 75 && point > 55) {

            Intent myIntent = new Intent(getBaseContext(), Result.class);
            myIntent.putExtra("Res", "ـدیـن مـعـنـی اسـت که شما یک گل آفتابگردان هستید در بستری از گل های رز.یک ویژگی بارز در شما وجود دارد که باعث گرمادهی به دیگران و جلوه گری شــمـــا مـــی شـــود.مــمــکـــن اســـت شــمــا کوچک ترین فرزند خانواده یا تنها فرزند باشید. در وقت لازم جدی هستید، ولی دوستانتان شما را به عنوان یک شخص شوخ طبع می شناسند.از گفتن جوک لذت می برید.گاهی شیطنت می کنید.مایلید که با افراد جدید و جالبی در زندگیتان آشنا شوید.با افرادی که هیچ وقت نمی خندند،راحت نیستید.دید مثبتی به زندگی دارید.در همه چیز به دنبال خوبی ها هستید.بیدی نـیـسـتـیـد کـه بـا هـر بـادی بـلـرزید.گرم،دوست داشتنی،باوفا و اجتماعی هستید و هر کدام از این صفات می تواند دلیلی برای خوب بودن شما باشد.انرژی نامحدودی دارید ولی انگیزه تان کم است.");
            startActivity(myIntent);
        }

        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    // this event will enable the back
    // function to the button on press
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
