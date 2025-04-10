package com.example.stepcount_osipov;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public Boolean Active = false;
    SensorManager SensorManager;
    private int count = 0;
    private TextView text;
    private long lastUpdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }
    @Override
    protected void onResume(){
        super.onResume();
        SensorManager.registerListener((SensorEventListener) this,
                SensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause(){
        super.onPause();
        SensorManager.unregisterListener((SensorEventListener) this);
    }

    public void onStoped(View view){
        Active = !Active;
        if (!Active){
            Button button = findViewById(R.id.bthPause);
            
        }
        else {
            Button button = findViewById(R.id.bthPause);
        }
    }
}