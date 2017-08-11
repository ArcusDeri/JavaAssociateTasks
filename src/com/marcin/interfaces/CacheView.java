package com.marcin.interfaces;

public interface CacheView {
    int size();

    CacheItem getItem(int index);

    CacheItem getItem(String key);
}
