package com.example.myapplication1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;


//nbvnbkjbhbkjhb
public class MainActivity extends AppCompatActivity {
private Spinner spinnerColors;
private TextView descriptionOfTemp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerColors = findViewById(R.id.spinnerColors);
        descriptionOfTemp = findViewById(R.id.descriptionOfTemp);
    }

    public void showDescription(View view) {
        int position = spinnerColors.getSelectedItemPosition();
        String description = getDescription(position);
        descriptionOfTemp.setText(description);

    }
    private String getDescription(int position){
        String[] getDescriptionP = getResources().getStringArray(R.array.description_of_temp);
        return getDescriptionP[position];
    }
}