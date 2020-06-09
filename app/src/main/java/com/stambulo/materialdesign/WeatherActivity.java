package com.stambulo.materialdesign;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;

public class WeatherActivity extends AppCompatActivity {
    MaterialButton snackBarButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        snackBarButton = findViewById(R.id.snackBarButton);
        setSnackBarButtonClickListener();
    }

    private void setSnackBarButtonClickListener() {
        snackBarButton.setOnClickListener(view -> Snackbar.make(view, "Действие подтверждено !", Snackbar.LENGTH_LONG).show());
    }
}