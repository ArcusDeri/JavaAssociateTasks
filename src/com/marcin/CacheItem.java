package com.marcin;

public class CacheItem implements com.marcin.interfaces.CacheItem {
    private String Key;
    private Object Value;

    CacheItem(){}

    CacheItem(String key, Object value){
        this.Key = key;
        this.Value = value;
    }

    @Override
    public String getKey() {
        return this.Key;
    }

    @Override
    public Object getValue() {
        return this.Value;
    }

    public void setKey(String name) {
        this.Key = name;
    }

    public void setValue(Object val) {
        this.Value = val;
    }
}
