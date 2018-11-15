package com.example.administrator.start;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Traineradapter extends ArrayAdapter<Trainer> {
    private int resourceId;

    public Traineradapter(Context context, int textViewResourceId, List<Trainer> objects)
    {
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Trainer tr=getItem(position);
        View view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView trainerImage = (ImageView)view.findViewById(R.id.trainer_image);
        TextView trainerName=(TextView)view.findViewById(R.id.trainer_name);
        trainerImage.setImageResource(tr.getImageId());
        trainerName.setText(tr.getName());
        return view;

    }
}
