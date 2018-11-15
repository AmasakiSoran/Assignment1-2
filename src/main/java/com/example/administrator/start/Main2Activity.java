package com.example.administrator.start;

import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.content.Intent;
import android.view.View;

public class Main2Activity extends Activity {
    private Button button4;
    private Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button4 = (Button) findViewById(R.id.button2);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(Main2Activity.this , Main3Activity.class);
                startActivity(i);
            }
        });

        button5 = (Button) findViewById(R.id.button);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent m = new Intent(Main2Activity.this , Main6Activity.class);
                startActivity(m);
            }
        });

    }

}
