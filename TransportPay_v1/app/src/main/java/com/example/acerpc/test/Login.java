package com.example.acerpc.test;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener{


    Spinner sp;

    String names[] = {"Azerbaijan", "Belarus"};

    ArrayAdapter<String> adapter;

    String record = "";

    boolean flag;

    TextView countryText;

    EditText phoneCode;


    ImageView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        sp = (Spinner)findViewById(R.id.spinner_countries);

        countryText = (TextView)findViewById(R.id.country_code);

        phoneCode = (EditText)findViewById(R.id.phone_number);
        phoneCode.setHint("Enter your phone number");

        Button login = (Button) findViewById(R.id.button_login);

        login.setOnClickListener(this);


        adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_text,names);

        sp.setAdapter(adapter);



        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                ((TextView) adapterView.getChildAt(0)).setTextSize(12);
                if(position == 0){
                    record = "Azerbaijan";
                    countryText.setText("+994");
                }

                if(position == 1){
                    record = "Belarus";
                    countryText.setText("+375");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button_login){
            Intent changeToTickets = new Intent(this, Tickets.class);
            startActivity(changeToTickets);
        }
    }
}
