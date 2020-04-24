package com.example.vmac.WatBot;



import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;



import java.util.ArrayList;
import java.util.List;



public class Main2Activity extends AppCompatActivity {

    Button selfcarebtn,chatbotbtn,dochelpbtn,btn,hotlinebtn;
    MediaPlayer ring;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        selfcarebtn=findViewById(R.id.selfcarebtn);
        btn=findViewById(R.id.button);
        dochelpbtn=findViewById(R.id.doctorhelpbtn);
        hotlinebtn=findViewById(R.id.helplinebtn);

        selfcarebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent=new Intent(Main2Activity.this, Selfcare.class);
                startActivity(homeintent);
            }
        });


        dochelpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent=new Intent(Main2Activity.this, helpful_website.class);
                startActivity(homeintent);
            }
        });
        hotlinebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent=new Intent(Main2Activity.this, hotline.class);
                startActivity(homeintent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent homeintent=new Intent(Main2Activity.this, MainActivity.class);
                startActivity(homeintent);
            }
        });

    }


}
