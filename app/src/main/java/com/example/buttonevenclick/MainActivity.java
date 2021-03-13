package com.example.buttonevenclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnsignin;
    EditText edpassword, edemail;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsignin= findViewById(R.id.btnSigIn);
        edemail = findViewById(R.id.edEmail);
        edpassword = findViewById(R.id.edPassword);

        btnsignin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                nama = edemail.getText().toString();
                password = edpassword.getText().toString();



                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda: "+nama+" dan password anda: "+password+"", Toast.LENGTH_LONG);
                t.show();


            }
        });
    }

}