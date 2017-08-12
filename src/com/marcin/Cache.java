package com.marcin;

import java.util.Vector;

public class Cache implements com.marcin.interfaces.Cache {
    private Vector Storage = new Vector<CacheItem>(0,1);
    private int MaxSize = 0;

    Cache(int size){
        this.MaxSize = size;
    }

    @Override
    public CacheItem cacheItem(Object item, String key) {
        CacheItem insertedItem = new CacheItem(key, item);

        if(!this.IsStorageFull()){
            this.Storage.add(insertedItem);
        }
        else
        {
            this.RemoveFirstCachedObject();
            this.Storage.add(insertedItem);
        }

        return insertedItem;
    }

    @Override
    public void invalidateCache() {
        this.Storage.clear();
    }

    @Override
    public CacheView getView() {
        return new CacheView(this);
    }
    private boolean IsStorageFull(){
        if(this.Storage.size() < this.MaxSize)
            return false;
        else
            return true;
    }

    private void RemoveFirstCachedObject(){
        this.Storage.removeElementAt(0);
    }

    public int getSize(){
        return this.Storage.size();
    }

    public CacheItem getElement(int index){
        return (CacheItem) this.Storage.elementAt(index);
    }

    public CacheItem getElementByKey(String key){
        for (int i = 0; i < this.Storage.size(); i++) {
            CacheItem ci =(CacheItem) this.Storage.elementAt(i);
            if(ci.getKey().equals(key))
                return ci;
        }
        return new CacheItem();
    }
}
