package com.marcin.interfaces;

public interface Cache {
    CacheItem cacheItem(Object item, String key);

    void invalidateCache();

    CacheView getView();
}
