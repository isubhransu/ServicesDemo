package asu.edu.ssmishra.servicesdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startMethod(View view){
        Intent i = new Intent(this, MyService.class);
        i.putExtra("message", "This is my message");
        startService(i);
    }

    public void stopMethod(View view){
        Intent j = new Intent(this, MyService.class);
        stopService(j);
    }
}
