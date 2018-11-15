package com.example.administrator.start;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.exception.BmobException;
import android.widget.Toast;


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

public class register extends Activity {
    private Button button3;
    private EditText et;
    private EditText et1;
    private EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        button3 = (Button) findViewById(R.id.button3);
        et = (EditText) findViewById(R.id.pw_message);
        et1 = (EditText) findViewById(R.id.id_message);
        et2 = (EditText) findViewById(R.id.makesure_pw);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                BmobUser user =new BmobUser();
                user.setUsername(et.getText().toString());
                user.setPassword(et1.getText().toString());
                user.signUp(new SaveListener<User>() {
                    @Override public void done(User user, BmobException e) {
                        if(e==null) {
                                Toast.makeText(register.this, "用户名已存在", Toast.LENGTH_SHORT).show();

                        }
                        else {
                            if (et1.getText().toString().equals(et2.getText().toString())) {
                                Toast.makeText(register.this, "注册成功", Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(register.this, MainActivity.class);
                                startActivity(i);
                            } else {
                                Toast.makeText(register.this, "两次密码不一致", Toast.LENGTH_SHORT).show();

                            }
                        }
                    }
                });

               /* User ur = new User();
                ur.setName(et.getText().toString());
                ur.setpw(et1.getText().toString());
                ur.save(new SaveListener<String>() {
                    @Override
                    public void done(String objectId,BmobException e) {
                       if(e==null){
                           if(et1.getText().toString().equals(et2.getText().toString())) {
                               Toast.makeText(register.this,"注册成功",Toast.LENGTH_SHORT).show();
                               Intent i = new Intent(register.this, MainActivity.class);
                               startActivity(i);
                           }
                           else{
                               Toast.makeText(register.this,"两次密码不一致",Toast.LENGTH_SHORT).show();
                           }
                      }
                      else{
                           Toast.makeText(register.this,"用户名已存在",Toast.LENGTH_SHORT).show();
                       }
                    }
                });*/


            }
        });
    }

}
