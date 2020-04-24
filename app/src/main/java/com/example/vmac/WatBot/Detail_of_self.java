package com.example.vmac.WatBot;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;

public class Detail_of_self extends AppCompatActivity {
    String title,name;
    TextView detailtitle;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_of_self);

        detailtitle=findViewById(R.id.detailtitletxt);




    }
}
