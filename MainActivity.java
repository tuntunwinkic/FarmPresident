package com.example.ttwin.farmpresident;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    /*Button btn;
    EditText edt;*/
    ListView lv;
    ArrayList<String> StrArray;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* btn=(Button)findViewById(R.id.button);
        edt=(EditText)findViewById(R.id.editText);*/
        lv=(ListView)findViewById(R.id.listview);

        StrArray=new ArrayList<String>();

            StrArray.add("Harvesting in Central Kenya, Full Time, Urgent");
            StrArray.add("Cows Livestock in Nirubi,Full Time, Urgent");
            StrArray.add("Watering in West Hanahai, Part Time, Urgent");
            StrArray.add("Operating Farm Machinery in Gombe, Part Time");
            StrArray.add("Buffalo Livestock in Nirubi,Full Time, Urgent");




        adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,StrArray);
        lv.setAdapter(adapter);

      /*  btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StrArray.add(edt.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
*/
        lv.setOnItemClickListener(MainActivity.this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),"in here"+position,Toast.LENGTH_LONG).show();

        Intent intent=new Intent(MainActivity.this,JobDescriptionActivity.class);
        startActivity(intent);

    }
}
