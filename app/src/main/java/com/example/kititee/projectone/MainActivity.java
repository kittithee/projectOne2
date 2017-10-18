package com.example.kititee.projectone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect imgitem
        final ImageView imgitem = (ImageView)findViewById(R.id.imgitem);

        //Connect btnhammer
        Button btnhammer = (Button)findViewById(R.id.btnhammer);
        //Click button show hammer image
        btnhammer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Show image hammer
                imgitem.setImageResource(R.drawable.hammer);



            }
        });
        //Connect btnscissors
        Button btnscissors = (Button)findViewById(R.id.btmscissors);
        //Click button show scissors image
        btnscissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Show image scissors
                imgitem.setImageResource(R.drawable.scissors);
            }
        });
    }
}


