package com.example.words;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;
import com.example.words.databinding.ActivityGameOneBinding;

public class GameOneActivity extends AppCompatActivity {
    private ActivityGameOneBinding binding;
    private static final String CORRECT_WORD="ПРОГРАММИСТ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityGameOneBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
         initImage();
         initListener();
    }

    private void initListener() {
        binding.letter1.setOnClickListener(view -> {
            binding.edLetter.append(binding.letter1.getText().toString());
            binding.letter1.setVisibility(View.INVISIBLE);

        });
    }

    private void initImage() {
        Glide.with(this).load("https://rsv.ru/blog/wp-content/uploads/2021/09/programmist-918x516.jpg").into(binding.imageOne);
        Glide.with(this).load("https://rsv.ru/blog/wp-content/uploads/2021/09/programmist-918x516.jpg").into(binding.imageTwo);
        Glide.with(this).load("https://rsv.ru/blog/wp-content/uploads/2021/09/programmist-918x516.jpg").into(binding.imageThree);
        Glide.with(this).load("https://rsv.ru/blog/wp-content/uploads/2021/09/programmist-918x516.jpg").into(binding.imageFour);



    }
}