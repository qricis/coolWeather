package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Description
 * <p>
 * id是每个实体类都应该有的字段
 * countyName记录县的名字
 * countyCode记录县的代码
 * cityId记录当前县所属市的id
 * @author qricis on 2020/9/3 14:47
 * @version 1.0.0
 */
public class County extends DataSupport {

    private int id;

    private String countyName;

    private int countyCode;

    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
