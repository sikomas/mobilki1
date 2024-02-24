package com.stepa.a123;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.stepa.a123.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    EditText textView;
    ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        textView = binding.edittext2;

        Intent intent = getIntent();
        String text = intent.getStringExtra("text1");
        textView.setText(text);

    }

    public void click(View view) {
        Log.i("КНОПОЧКА", "Зачем жмав на кнопку?");
        String text = binding.edittext2.getText().toString();
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        intent.putExtra("text2", text);
        startActivity(intent);

    }
}
