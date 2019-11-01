package com.example.blacktel.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by BlackTEL on 2019/10/31.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
