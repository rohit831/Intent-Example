package com.ex.rohit.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    TextView email_2;
    TextView password_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        email_2 = (TextView)findViewById(R.id.email_2);
        password_2 = (TextView)findViewById(R.id.password_2);

        Bundle login_data = getIntent().getExtras();
        if(login_data==null)
        {
            return;
        }
        String email2 = login_data.getString("email_2");
        String password2 = login_data.getString("password_2");
        email_2.setText(email2);
        password_2.setText(password2);
    }
    public void onClick(View v)
    {
        Intent j = new Intent(this,MainActivity.class);
        startActivity(j);
    }
}
