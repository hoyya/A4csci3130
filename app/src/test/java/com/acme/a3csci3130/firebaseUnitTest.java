package com.acme.a3csci3130;

import com.google.firebase.database.FirebaseDatabase;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */


public class firebaseUnitTest {


    public Business test_business;
    String province = "NS";
    String name = "test_business";
    String number = "000000001";
    String address = "yo mammas house";
    String primary_business = "Fisher";

    @Test
    public void adds_business() throws Exception {



        assertEquals(4, 2 + 2);
    }

    @Test
    public void deletes_business() throws Exception{

    }

    @Test
    public void updates_business() throws Exception{

    }

}