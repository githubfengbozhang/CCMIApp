package com.example.hccc;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar =getSupportActionBar();
        if (actionBar!=null)
        {
            actionBar.hide();
        }
        Button button1 = (Button) findViewById(R.id.submit);
        final EditText editText=(EditText) findViewById(R.id.account1);
        final EditText editText1=(EditText) findViewById(R.id.passowd);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String account=editText.getText().toString();
                String password=editText1.getText().toString();
                if (account.equals("admin")&&password.equals("888888"))
                {
                    Intent intent =new Intent(MainActivity.this,MenuActivity.class);
                    startActivity(intent);
                }else{

                    Toast.makeText(MainActivity.this,"请输入正确的账号密码",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
