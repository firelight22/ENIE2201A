package com.quentinrouet.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.TextView;

import com.quentinrouet.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding amb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main);
        JeuxVideo lou2 = new JeuxVideo("The Last Of Us 2","Naughty Dog", "survival horror","PS4",40.0f);
        amb.setJv(lou2);
    }
}