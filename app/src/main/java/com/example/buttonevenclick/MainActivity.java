package com.example.buttonevenclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button btnsignin;
    EditText edpassword, edemail;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] eUser = getResources().getStringArray(R.array.emailUser);
        String[] ePass = getResources().getStringArray(R.array.emailPass);

        btnsignin= findViewById(R.id.btnSigIn);
        edemail = findViewById(R.id.edEmail);
        edpassword = findViewById(R.id.edPassword);

        btnsignin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (Arrays.asList(eUser).contains(edemail) &&
                        Arrays.asList(ePass).contains(edpassword)){
                    Toast.makeText(MainActivity.this,
                            "Login Berhasil",Toast.LENGTH_LONG).show();

                }else {
                    Toast.makeText(MainActivity.this,
                            "Login Gagal",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

}