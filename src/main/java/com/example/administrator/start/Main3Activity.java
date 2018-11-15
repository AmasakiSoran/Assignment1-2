package com.example.administrator.start;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;
import java.util.List;

import java.util.ArrayList;

public class Main3Activity extends Activity {
    private List<Trainer> trainerList= new ArrayList<>();
    private String[] data={"Anna","Jack","Ning","theShy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initTrainer();
        Traineradapter adapter=new Traineradapter(Main3Activity.this,R.layout.trainer_item,trainerList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
    private void initTrainer(){
        for(int i=0;i<2;i++){
            Trainer tr1=new Trainer("tr1",R.drawable.trainer1);
            trainerList.add(tr1);
            Trainer tr2=new Trainer("tr2",R.drawable.trainer3);
            trainerList.add(tr2);
            Trainer tr3=new Trainer("tr3",R.drawable.trainer1);
            trainerList.add(tr3);
            Trainer tr4=new Trainer("tr4",R.drawable.trainer3);
            trainerList.add(tr4);

        }
    }
}
