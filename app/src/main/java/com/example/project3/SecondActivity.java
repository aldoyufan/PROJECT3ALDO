package com.example.project3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    public static final String REPLY_MESSAGE ="MESSAGE";
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        textView=findViewById(R.id.text_message1);
        editText=findViewById(R.id.editText);

        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        textView.setText(message);

    }

    public void openMainActivity(View view) {
        Intent intent=new Intent(this, SecondActivity.class);
        String message=editText.getText().toString();
        intent.putExtra(REPLY_MESSAGE, message);
        startActivity(intent);
    }
}