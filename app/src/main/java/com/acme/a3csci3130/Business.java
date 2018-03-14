package com.acme.a3csci3130;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Class that defines how the data will be stored in the
 * Firebase databse. This is converted to a JSON format
 */

public class Business implements Serializable {

    public  String bid;
    public  String name;
    public  String number;
    public String province;
    public String address;
    public String primary_business;

    public Business() {
        // Default constructor required for calls to DataSnapshot.getValue
    }

    public Business(String bid, String name, String number){
        this.bid = bid;
        this.name = name;
        this.number = number;
    }

    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("bid", bid);
        result.put("name", name);
        result.put("number", number);

        return result;
    }
}
