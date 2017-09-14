package com.example.hccc;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.remove:
                Toast.makeText(MenuActivity.this,"删除",Toast.LENGTH_SHORT).show();
                break;
            case R.id.add_item:
                Toast.makeText(MenuActivity.this,"添加",Toast.LENGTH_LONG).show();
                break;
            default:
        }
        return true;
    }
}
