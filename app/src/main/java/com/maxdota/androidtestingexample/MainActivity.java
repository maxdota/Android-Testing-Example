package com.maxdota.androidtestingexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.maxdota.androidtestingexample.model.TModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TModel model = new TModel();
        TextView contentText = (TextView) findViewById(R.id.content_text);
//        contentText.setText(getString(R.string.result_format, model.getDoubleResult(2)));
    }
}
