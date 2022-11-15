package com.example.ktra;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity {
    EditText edtUserName, edtPassWord;
    Button btnLogin, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        edtUserName = (EditText) findViewById(R.id.editTextUserName);
        edtPassWord = (EditText) findViewById(R.id.editTextPassWord);
        btnLogin = (Button) findViewById(R.id.buttonLogin);
        btn4 = (Button) findViewById(R.id.button4);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "vovanthanh";
                String password = "123456";
                if(edtUserName.getText().toString().equals(username) && edtPassWord.getText().toString().equals(password)){
                    Toast.makeText(getApplicationContext(),"Dang Nhap Thanh Cong",Toast.LENGTH_LONG).show();
                    Intent mh2 = new Intent(SignIn.this, CongAn.class);
                    startActivity(mh2);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Tai Khoan Hoac Mat Khau Sai",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}