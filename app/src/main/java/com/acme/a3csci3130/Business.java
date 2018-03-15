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

    public Business(String bid, String name, String province, String address, String primary_business, String number){
        this.bid = bid;
        this.name = name;
        this.province = province;
        this.address = address;
        this.primary_business = primary_business;
        this.number = number;

    }

    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("bid", bid);
        result.put("name", name);
        result.put("province", province);
        result.put("address", address);
        result.put("primary business", primary_business);




        return result;
    }

    public String toString(){
        return (this.bid + "\n" +
                this.bid + "\n" +
                this.bid + "\n" +
                this.bid + "\n" +
                this.bid + "\n" +
                this.bid + "\n");

    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrimary_business() {
        return primary_business;
    }

    public void setPrimary_business(String primary_business) {
        this.primary_business = primary_business;
    }

}
