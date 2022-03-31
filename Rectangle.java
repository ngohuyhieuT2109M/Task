package com.company;

import java.lang.reflect.Parameter;
import java.util.regex.Matcher;

public class Rectangle {
    int width;
    int height;


    Rectangle(){
        width = 10;
        height = 10;
    }
    Rectangle (int wid, int heig) {
        System.out.println("Parameterized Constructor");
        width = wid;
        height = heig;
    }
 public  void  displayDimensions (){
        System.out.println("width:" + width);
        System.out.println("width:" + height);
    }
}
