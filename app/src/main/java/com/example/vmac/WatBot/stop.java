package com.example.vmac.WatBot;



import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class stop extends AppCompatActivity {
    Button stopplzbtn;
    int count1=0;
    MediaPlayer ring1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop);

        stopplzbtn=findViewById(R.id.stopplzbtn);
        stopplzbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count1 == 0){
                    stopplzbtn.isEnabled();
                    ring1= MediaPlayer.create(stop.this,R.raw.stop);
                    ring1.start();
                    count1++;
                }else if (count1 >= 1)
                    stopplzbtn.setClickable(false);

            }
        });
    }
    @Override
    protected void onPause() {
        super.onPause();
        ring1.release();

    }
}
