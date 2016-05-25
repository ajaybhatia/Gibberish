package com.ajaybhatia.gibberish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.nameEditText);
        textView = (TextView) findViewById(R.id.resultTextView);
    }


    public void gibberish(View view) {
        String name = editText.getText().toString();

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < name.length(); i++)
            list.add(name.charAt(i));

        Collections.shuffle(list);

        StringBuilder s = new StringBuilder();
        for (Character c : list)
            s.append(c);

        textView.setText(s.toString());

    }
}
