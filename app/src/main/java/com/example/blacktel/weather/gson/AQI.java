package com.example.blacktel.weather.gson;

/**
 * Created by BlackTEL on 2019/10/31.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String api;
        public String pm25;
    }
}
