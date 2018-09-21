package com.example.ajaym.serializableandparcelable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView mTextView = new TextView(this);
        Book mBook = (Book) getIntent().getParcelableExtra(MainActivity.PAR_KEY);

        mTextView.setText("Book name is: " + mBook.getBookName() + "\n" +
                "Author is: " + mBook.getAuthor() + "\n" +
                "PublishTime is: " + mBook.getPublishTime());
        setContentView(mTextView);
    }
}