package com.quentinrouet.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.text.TextUtils;

import com.quentinrouet.databinding.databinding.ActivityLivreBinding;

public class LivreActivity extends AppCompatActivity {
    ActivityLivreBinding alb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        alb = DataBindingUtil.setContentView(this,R.layout.activity_livre);
        alb.setLivre(new Livre("The Digital Transformation Book", "Digital Trandormation Startu pbook", "Columbia Business School",
                "270 pages","David L Rogers",29));
        alb.textViewResume.setMaxWidth(200);
        alb.textViewResume.setMaxLines(2);
        alb.textViewResume.setEllipsize(TextUtils.TruncateAt.MIDDLE);
    }
}