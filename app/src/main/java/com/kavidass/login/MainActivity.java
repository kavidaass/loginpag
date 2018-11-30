package com.kavidass.login;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextInputEditText user,pass;
    Button cancel_btn,login_btn,newuser_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        user = (TextInputEditText) findViewById(R.id.username);
        pass = (TextInputEditText) findViewById(R.id.password);
        cancel_btn = (Button) findViewById(R.id.btn_cancel);
        login_btn = (Button) findViewById(R.id.btn_login);
        newuser_btn =(Button) findViewById(R.id.btn_New_sign_up);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Username can not be empty", Toast.LENGTH_SHORT).show();
                } else if(pass.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Password can not be empty", Toast.LENGTH_SHORT).show();
                }else if(pass.getText().toString().length() < 8){
                    Toast.makeText(getApplicationContext(), "Password length should be 8 characters!", Toast.LENGTH_SHORT).show();
                }else{
                   // login_btn.setText("Username: "+user.getText()+"\nPassword: "+pass.getText());

                    user.setText("");
                    pass.setText("");

                    startActivity(new Intent(MainActivity.this,Main2Activity.class));
                }
            }
        });

        newuser_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });
    }




}
