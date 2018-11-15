package com.example.administrator.start;

import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.content.Intent;
import android.view.View;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.exception.BmobException;
import android.widget.Toast;


public class Main5Activity extends Activity {
    private Button button3;
    private EditText et;
    private EditText et1;
    @Override
    protected   void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        button3 = (Button) findViewById(R.id.button3);
        et = (EditText) findViewById(R.id.pw_message);
        et1 = (EditText) findViewById(R.id.makesure_pw);

        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){


                BmobUser ur = new BmobUser();
               // User ur = new User();
                ur.setUsername(et.getText().toString());
                ur.setPassword(et1.getText().toString());
                ur.login(new SaveListener<BmobUser>() {
                    @Override public void done(BmobUser bmobUser, BmobException e)
                    { if(e==null){
                        Toast.makeText(Main5Activity.this,bmobUser.getUsername()+"登录成功",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Main5Activity.this , Main2Activity.class);
                        startActivity(i);
                    }
                        else {Toast.makeText(Main5Activity.this,"登录失败",Toast.LENGTH_SHORT).show();
                         } } });

            }
        });
    }

}
