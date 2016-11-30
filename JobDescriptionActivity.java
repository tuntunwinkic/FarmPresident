package com.example.ttwin.farmpresident;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JobDescriptionActivity extends AppCompatActivity {

    Button see_map,apply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_description);

        see_map=(Button)findViewById(R.id.btnseemaponJobDescription);
        apply=(Button)findViewById(R.id.btnappyonJobDescription);
        see_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map_call_intent=new Intent(JobDescriptionActivity.this,SeeMapsActivity.class);
                startActivity(map_call_intent);
            }
        });

        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent confirm_intent=new Intent(JobDescriptionActivity.this,Employee_Info_Activity.class);
                startActivity(confirm_intent);
            }
        });

    }
}
