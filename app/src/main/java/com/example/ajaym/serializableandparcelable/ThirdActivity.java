package com.example.ajaym.serializableandparcelable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView mTextView = new TextView(this);
        Person mPerson = (Person) getIntent().getSerializableExtra(MainActivity.SER_KEY);
        mTextView.setText("You name is: " + mPerson.getName() + "\n" +
                "You age is: " + mPerson.getAge());

        setContentView(mTextView);   //setting content view to dynamically text view ..you dont need to set it to a particular xml file
    }
}
