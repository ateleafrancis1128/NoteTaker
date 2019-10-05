package com.example.notetaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editUsername,editPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void findView(){
     editUsername=findViewById(R.id.edt_username);
     editPassword=findViewById(R.id.edt_password);
     btnLogin=findViewById(R.id.btn_login);
    }
    private void setListen(){
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){

                String inputUsername=edit.getText().toString();
                String inputPassword=edit.getText().toString();

                if(inputUsername.equals(username) && inputPassword.equals(password)) {

                    Toast.makeText(MainActivity.this, "Login Sucessfully", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();

                }
            }

        });


    }
}
