package com.bookit.utilities;

import org.junit.Assert;
import org.junit.Test;
// We authenticate, retrieve token every time, to reduce duplication in this APIUtilities class we will have
// reusable codes related to API, method returns token as String,
// token is issued by server, encrypted String password.
// We send request with user name password it will send token,
// and every single api call has to have token, like password.
// apiKey == token? no, api key and token is not same, but has same purpose
// both provide access to the resource. The way how they are issued, created is different
// "apiKey will not expire.. issued once and you specify as query param..
// but token like bearer token is in Header and it will expire after some time"(sofiya)
public class APIUtilitiesUnitTests {


    @Test
    public void getTokenTest(){
        String token = APIUtilities.getToken();
        String tokenForStudent = APIUtilities.getToken("student");
        String tokenForTeacher = APIUtilities.getToken("teacher");

        Assert.assertNotNull(token);
        Assert.assertNotNull(tokenForStudent);
        Assert.assertNotNull(tokenForTeacher);
    }
}
