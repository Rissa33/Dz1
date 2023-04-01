package com.example.myapplication;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    private static final String KEY_COUNT = "key";
    private TextView textCount;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textCount = findViewById(R.id.textView);
    }

    public void onCountClick(View view) {
        count++;
        textCount.setText(Integer.toString(count));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNT, count);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        count = savedInstanceState.getInt(KEY_COUNT);
    }

    @Override    protected void onStart() {
        super.onStart();
    }

    @Override    protected void onStop() {
        super.onStop();
    }

    @Override    protected void onDestroy() {
        super.onDestroy();
    }

    @Override    protected void onPause() {
        super.onPause();
    }

    @Override    protected void onResume() {
        super.onResume();
    }
}