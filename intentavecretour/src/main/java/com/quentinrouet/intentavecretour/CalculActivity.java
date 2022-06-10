package com.quentinrouet.intentavecretour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalculActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcul);
        Button buttonCalcul = findViewById(R.id.buttonCalcul);
        buttonCalcul.setOnClickListener(v -> {
            Intent intentData = new Intent();
            intentData.putExtra("resultatCalcul",897);
            setResult(RESULT_OK,intentData);
            finish();
        });
    }
}