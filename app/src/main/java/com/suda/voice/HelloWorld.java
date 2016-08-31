package com.suda.voice;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;



public class HelloWorld extends Activity {
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_hello_world);
        startMainAvtivity();
    }
    private void startMainAvtivity() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                intent=new Intent(HelloWorld.this,SecondActivity.class);
                startActivity(intent);
                HelloWorld.this.finish();//结束本Activity
            }
        }, 2000);//设置执行时间
    }
}

