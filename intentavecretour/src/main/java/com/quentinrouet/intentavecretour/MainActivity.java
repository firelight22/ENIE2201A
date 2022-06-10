package com.quentinrouet.intentavecretour;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonDemanderCalcul =findViewById(R.id.buttonDemanderCalcul);

        buttonDemanderCalcul.setOnClickListener(vue -> {
            Intent intentToCalcul = new Intent(this,CalculActivity.class);
            startActivityForResult(intentToCalcul, 1234);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1234 && resultCode == RESULT_OK){
            Toast.makeText(this, String.valueOf(data.getIntExtra("resultatCalcul",0)), Toast.LENGTH_SHORT).show();
        }
    }
}