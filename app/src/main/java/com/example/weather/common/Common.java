package com.example.weather.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {

    public static String API_KEY="8a0fd0a83fc192a193bfce140842e76d";
    public static String API_LINK="http://api.openweathermap.org/data/2.5/weather";

    public static String apiRequest(String latitude, String longtitude){

        return API_LINK+"?lat="+latitude+"&lon="+longtitude+"&appid="+API_KEY;
    }

    public static String unixTimeStampToDateTime(double unixTimeStamp){
        DateFormat dateFormat=new SimpleDateFormat("HH:mm");
        Date date=new Date();
        date.setTime((long)unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    public static String getImage(String icon){
        return String.format("http://openweathermap.org/image/w/%s.png", icon);
    }

    public static String getDateNow(){
        DateFormat dateFormat=new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date=new Date();
        return dateFormat.format(date);
    }
}


//https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid=8a0fd0a83fc192a193bfce140842e76d