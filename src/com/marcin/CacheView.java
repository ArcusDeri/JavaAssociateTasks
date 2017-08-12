package com.marcin;

import com.marcin.interfaces.CacheItem;

public class CacheView implements com.marcin.interfaces.CacheView {

    private Cache Cache;

    CacheView(Cache c){
        this.Cache = c;
    }

    @Override
    public int size() {
        return this.Cache.getSize();
    }

    @Override
    public CacheItem getItem(int index) {
        return this.Cache.getElement(index);
    }

    @Override
    public CacheItem getItem(String key) {
        return this.Cache.getElementByKey(key);
    }
}
