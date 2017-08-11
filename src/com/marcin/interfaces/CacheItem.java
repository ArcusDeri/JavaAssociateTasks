package com.marcin.interfaces;

public interface CacheItem {
    CacheItem cacheItem(Object item, String key);

    void invalidateCache();

    CacheView getView();
}
