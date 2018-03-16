package com.acme.a3csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;

public class DetailViewActivity extends Activity {

    private EditText nameField, provinceField, primary_businessField, numberField, addressField;
    Business receivedPersonInfo;
    private MyApplicationData appState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);
        receivedPersonInfo = (Business)getIntent().getSerializableExtra("new_business");

        MyApplicationData appData = (MyApplicationData)getApplication();
        appState = ((MyApplicationData) getApplicationContext());


        appData.firebaseDBInstance = FirebaseDatabase.getInstance();
        appData.firebaseReference = appData.firebaseDBInstance.getReference("Businesses");

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

        receivedPersonInfo.name = nameField.getText().toString() ;
        receivedPersonInfo.number = numberField.getText().toString();
        receivedPersonInfo.province = provinceField.getText().toString();
        receivedPersonInfo.address = addressField.getText().toString();
        receivedPersonInfo.primary_business = primary_businessField.getText().toString();

        appState.firebaseReference.child(receivedPersonInfo.bid).setValue(receivedPersonInfo);

        finish();

    }

    public void eraseBusiness(View v)
    {

        appState.firebaseReference.child(receivedPersonInfo.bid).removeValue();
        finish();

    }
}
