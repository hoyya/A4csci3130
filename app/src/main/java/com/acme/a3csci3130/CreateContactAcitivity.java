package com.acme.a3csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateContactAcitivity extends Activity {

    private Button submitButton;
    private EditText nameField, provinceField, primary_businessField, addressField, numberField;
    private MyApplicationData appState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_contact_acitivity);
        //Get the app wide shared variables
        appState = ((MyApplicationData) getApplicationContext());

        submitButton = (Button) findViewById(R.id.createButton);
        nameField = (EditText) findViewById(R.id.name);
        provinceField = (EditText) findViewById(R.id.province);
        primary_businessField = (EditText) findViewById(R.id.primary_business);
        numberField = (EditText) findViewById(R.id.number);
        addressField = (EditText) findViewById(R.id.address);




    }

    public void submitInfoButton(View v) {
        //each entry needs a unique ID
        String businessID = appState.firebaseReference.push().getKey();
        String name = nameField.getText().toString();
        String province = provinceField.getText().toString();
        String primary_business = primary_businessField.getText().toString();
        String address = addressField.getText().toString();
        String number = numberField.getText().toString();
        Business person = new Business(businessID, name, province, address, primary_business, number);

        appState.firebaseReference.child(businessID).setValue(person);

        finish();

    }
}
