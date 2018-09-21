package com.example.ajaym.serializableandparcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sButton,pButton;
    public  final static String SER_KEY = "com.example.ajaym.serializableandparcelable.ser";
    public  final static String PAR_KEY = "com.example.ajaym.serializableandparcelable.par";
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();

    }

    public void setupViews(){
        sButton = (Button)findViewById(R.id.button1);
        pButton = (Button)findViewById(R.id.button2);
        sButton.setOnClickListener(this);
        pButton.setOnClickListener(this);
    }

    public void SerializeMethod(){
        Person mPerson = new Person();
        mPerson.setName("Ajay");
        mPerson.setAge(25);
        Intent mIntent = new Intent(this,ThirdActivity.class);
        Bundle mBundle = new Bundle();
        mBundle.putSerializable(SER_KEY,mPerson);
        mIntent.putExtras(mBundle);

        startActivity(mIntent);
    }

    public void PacelableMethod(){
        Book mBook = new Book();
        mBook.setBookName("Cooking Respie");
        mBook.setAuthor("Shefali");
        mBook.setPublishTime(2010);
        Intent mIntent = new Intent(this,SecondActivity.class);
        Bundle mBundle = new Bundle();
        mBundle.putParcelable(PAR_KEY, mBook);
        mIntent.putExtras(mBundle);

        startActivity(mIntent);
    }


    public void onClick(View v) {
        if(v == sButton){
            SerializeMethod();
        }else{
            PacelableMethod();
        }
    }
}