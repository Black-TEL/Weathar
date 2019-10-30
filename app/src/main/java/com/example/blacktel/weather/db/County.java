package com.example.blacktel.weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by BlackTEL on 2019/10/30.
 */

public class County extends DataSupport {
    private int id;
    private int cityId;             //记录当前县所属市的id值
    private String countyName;      //记录县的名字
    private String weatherId;       //记录县所对应的天气id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
