package com.acme.a3csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DetailViewActivity extends Activity {

    private EditText nameField, provinceField, primary_businessField, numberField, addressField;
    Business receivedPersonInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);
        receivedPersonInfo = (Business)getIntent().getSerializableExtra("new_business");

        nameField = (EditText) findViewById(R.id.name);
        provinceField = (EditText) findViewById(R.id.province);
        primary_businessField = (EditText) findViewById(R.id.primary_business);
        numberField = (EditText) findViewById(R.id.number);
        addressField = (EditText) findViewById(R.id.address);


        if(receivedPersonInfo != null){
            nameField.setText(receivedPersonInfo.name);
            provinceField.setText(receivedPersonInfo.province);
            primary_businessField.setText(receivedPersonInfo.primary_business);
            numberField.setText(receivedPersonInfo.number);
            addressField.setText(receivedPersonInfo.address);

        }
    }

    public void updateBusiness(View v){
        //TODO: Update contact funcionality

    }

    public void eraseBusiness(View v)
    {
        //TODO: Erase contact functionality
    }
}
