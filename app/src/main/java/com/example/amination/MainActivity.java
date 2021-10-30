package com.example.amination;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
public void fade(View view){
    Log.i("info"," image pressed");
    ImageView imageView1=(ImageView) findViewById(R.id.imageView1);
    ImageView imageView2=(ImageView) findViewById(R.id.imageView2);
     imageView1.animate().alpha(0).setDuration(2000);
    imageView2.animate().alpha(1).setDuration(2000);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}