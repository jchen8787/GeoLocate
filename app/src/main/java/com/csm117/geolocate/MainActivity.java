package com.csm117.geolocate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String MSG_KEY = "com.csm117.geolocate.MSG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayMap(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void listBluetooth(View view) {
        Toast.makeText(this, "not yet implemented", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, listBluetooth.class);
        startActivity(intent);
    }


    public void test(View view) {
        Toast.makeText(this, "test button pushed", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String msg = "testing page";
        intent.putExtra(MSG_KEY, msg);
        startActivity(intent);
    }
}
