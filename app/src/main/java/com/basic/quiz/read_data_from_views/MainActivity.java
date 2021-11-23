package com.basic.quiz.read_data_from_views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.basic.quiz.read_data_from_views.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // View Binding
        binding = ActivityMainBinding.inflate(
                (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE));
        setContentView(binding.getRoot());
    }

    /**
     * Prints all TextViews' text to Logcat.
     *
     * @param view is the clicked "Print Menu to Logs" Button.
     */
    public void printToLogs(View view) {
        Log.v(TAG, binding.textItemOne.getText().toString());
        Log.v(TAG, binding.textItemTwo.getText().toString());
        Log.v(TAG, binding.textItemThree.getText().toString());
    }
}