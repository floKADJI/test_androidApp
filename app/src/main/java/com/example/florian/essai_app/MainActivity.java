package com.example.florian.essai_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String INTENT_MSG = "com.example.florian.essai_app.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        EditText data = (EditText) findViewById(R.id.data);
        String msg = data.toString();

        final Button sendButton = (Button) findViewById(R.id.send);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //    Toast.makeText(sendButton.getContext(),"Open new activity", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(sendButton.getContext(), destIntent.class);
                startActivity(intent);
            }
        });
        */
    }

    // Called when the user taps the Send button
    public void send (View view){
        Intent intent = new Intent(this, destIntent.class);
        EditText data = (EditText) findViewById(R.id.data);
        String msg = data.getText().toString();
        intent.putExtra(INTENT_MSG, msg);
        startActivity(intent);
    }
}
