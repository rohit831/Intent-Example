package com.ex.rohit.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        signup = (Button) findViewById(R.id.signup);

    }
    public  void onClick(View v)
    {
        Intent i = new Intent(this,Main2Activity.class);
        email = (EditText)  findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);

        String email_2 = email.getText().toString();
        i.putExtra("email_2",email_2);
        String password_2 = password.getText().toString();
        i.putExtra("password_2",password_2);
        startActivity(i);
    }
}
