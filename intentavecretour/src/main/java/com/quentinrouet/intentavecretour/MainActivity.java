package com.quentinrouet.intentavecretour;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ActivityResultLauncher<Intent> arl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonDemanderCalcul =findViewById(R.id.buttonDemanderCalcul);
        arl = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if(result.getResultCode()== RESULT_OK){
                    Toast.makeText(
                        this,
                        String.valueOf(result.getData().getIntExtra("resultatCalcul",0)),
                        Toast.LENGTH_SHORT).show();
                }
            }
        );
        buttonDemanderCalcul.setOnClickListener(vue -> {
            Intent intentToCalcul = new Intent(this,CalculActivity.class);

            arl.launch(intentToCalcul);
        });
    }

}