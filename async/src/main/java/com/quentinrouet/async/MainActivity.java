package com.quentinrouet.async;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.os.Message;

import com.quentinrouet.async.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding amb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main);
        amb.buttonSansThread.setOnClickListener(v->{
            for(int i=0; i<=1000; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                amb.progressBar.setProgress(i);
            }
        });
        amb.buttonThread.setOnClickListener(v->{
            new Thread(() -> {
                for(int i=0; i<=1000; i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //On ne peut pas interrompre l'UI thread depuis un worker thread
                    amb.progressBar.setProgress(i);
                }
            }).start();
        });

    }
}