package com.maxdota.androidtestingexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestModel model = new TestModel();
        TextView contentText = (TextView) findViewById(R.id.content_text);
        contentText.setText(getString(R.string.result_format, model.getDoubleResult(2)));
    }
}
