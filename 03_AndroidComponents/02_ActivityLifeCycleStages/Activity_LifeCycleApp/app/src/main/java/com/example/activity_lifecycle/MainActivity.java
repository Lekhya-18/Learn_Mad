package com.example.activity_lifecycle;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView textView;
    private void addText(String msg) {
        textView.setText(textView.getText() + "\n" + msg);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        addText("onCreate called");
    }
    @Override
    protected void onStart() {
        super.onStart();
        addText("onStart called");
    }
    @Override
    protected void onResume() {
        super.onResume();
        addText("onResume called");
    }
    @Override
    protected void onPause() {
        super.onPause();
        addText("onPause called");
    }
    @Override
    protected void onStop() {
        super.onStop();
        addText("onStop called");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        addText("onDestroy called");
    }
}