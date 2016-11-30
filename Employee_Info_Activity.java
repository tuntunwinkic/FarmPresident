package com.example.ttwin.farmpresident;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Employee_Info_Activity extends AppCompatActivity {

    private EditText edtName;
    private Button confirm;
    private CheckBox checkBox_confirm;
    String name="Good Job";
    boolean checkonconfirm=false;
    String Farmer_ph_no="5556";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee__info_);


        confirm=(Button)findViewById(R.id.btntoSendSMS);


        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtName=(EditText)findViewById(R.id.edttxtNameofEmployee);

                Editable editable=edtName.getText();
                name+=editable.toString();
                CharSequence text = "Hello toast! "+name;

                checkBox_confirm=(CheckBox)findViewById(R.id.chkboxconfirm);
                if(checkonconfirm) {
                    SendSMStoEmployer();
                    Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
                    Intent successintent=new Intent(Employee_Info_Activity.this,SuccessActivity.class);
                    startActivity(successintent);

                }
                    else {
                    Toast.makeText(getApplicationContext(), "Hey Man Fill your name", Toast.LENGTH_LONG).show();
                }
            }
        });



    }
    protected void SendSMStoEmployer(){
        try {
            SmsManager manager = SmsManager.getDefault();
            manager.sendTextMessage(Farmer_ph_no, null, "I want to work in your farm", null, null);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void OnClickCheckbox(View view){
        boolean checked = ((CheckBox) view).isChecked();

        int Id=view.getId();
        if(Id==R.id.chkboxconfirm){
            if(checked){
               checkonconfirm=true;
            } else {
                checkonconfirm=false;
            }

        }

        /*switch(view.getId()) {
            case R.id.checkbox_meat:
                if (checked)
                // Put some meat on the sandwich
                else
                // Remove the meat
                break;
*/
    }
}
