package com.stepa.a123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.stepa.a123.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        init();
    }



    private void init() {
        binding.image.getLayoutParams().height = (int) getResources().getDimension(R.dimen.picture_height);
        binding.image.getLayoutParams().width = (int) getResources().getDimension(R.dimen.picture_width);
        binding.image.setBackground(getResources().getDrawable(R.drawable.icons8______240));
        binding.hello.setText(getResources().getText(R.string.picture_name));
        Intent intent = getIntent();
        String text = intent.getStringExtra("text2");
        binding.edittext1.setText(text);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("КНОПОЧКА", "Зачем жмав на кнопку?");
                String text = binding.edittext1.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("text1", text);
                startActivity(intent);
            }
        });
    }
}