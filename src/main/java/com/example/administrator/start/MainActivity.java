package com.example.administrator.start;
import cn.bmob.v3.Bmob;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
  private Button button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bmob.initialize(this,
                "cc1ce038ce8dfe894871c9df3506988e");
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this , register.class);
                startActivity(i);
            }
            });

        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent m = new Intent(MainActivity.this , Main5Activity.class);
                startActivity(m);
            }
        });

    }
}
