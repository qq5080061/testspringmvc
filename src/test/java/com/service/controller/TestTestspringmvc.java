package com.service.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTestspringmvc {

        TestspringmvcDelegate testspringmvcDelegate = new TestspringmvcDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testspringmvcDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}