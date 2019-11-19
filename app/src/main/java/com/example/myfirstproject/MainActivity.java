package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText txtFirstname, agee;
    Button btnAppend;
    TextView tvNames;
    RadioGroup rbtn;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFirstname = findViewById(R.id.firstname);
        agee = findViewById(R.id.age);
        btnAppend = findViewById(R.id.btnAppend);
        tvNames = findViewById(R.id.tvNames);
        rbtn = findViewById(R.id.radiosex);


        btnAppend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(txtFirstname.getText()))
                {
                    txtFirstname.setError("Enter your name");
                    return;
                }
                String name , str;
                int radioId, age;


//                int selectid= rbtn.getCheckedRadioButtonId();
  //              rb= (RadioButton) findViewById(selectid);

                name = txtFirstname.getText().toString();
                age= Integer.parseInt(agee.getText().toString());

                radioId=rbtn.getCheckedRadioButtonId();
                rb=findViewById(radioId);
                str="Name is "+name+" age "+age+" gender "+rb.getText()+"\n";
                tvNames.append(str);



            }
        });



    }
}

