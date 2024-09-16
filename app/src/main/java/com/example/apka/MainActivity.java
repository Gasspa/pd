package com.example.apka;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
        private Button buttonDisable;
        private Button wlacznik;
        private int count = 0;
        private TextView counter;

        @Override
        protected void onCreate(Bundle saveInstanceState){
            super.onCreate(saveInstanceState);
            setContentView(R.layout.activity_main);
            EdgeToEdge.enable(this);

            buttonDisable = findViewById(R.id.buttonDisable);
            wlacznik = findViewById(R.id.wlacznik);
            counter = findViewById(R.id.counter);
            counter.setText("Licznik: " + count);

            buttonDisable.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    count++;
                    counter.setText("Licznik: " + count);
                    buttonDisable.setEnabled(false);
                    Toast.makeText(MainActivity.this,"Przycisk został wyłaczony", Toast.LENGTH_SHORT).show();
                }
            });
            wlacznik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonDisable.setEnabled(true);
                }
            });
        }
    }

