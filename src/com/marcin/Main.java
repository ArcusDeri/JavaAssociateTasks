package com.marcin;

public class Main {

    public static void main(String[] args) {
        Cache myCache = new Cache(3);

        myCache.cacheItem("A object","A");
        CacheView cv = myCache.getView();
        PrintCache(cv);
        myCache.cacheItem("D object","D");
        PrintCache(cv);
        myCache.cacheItem("B object","B");
        PrintCache(cv);
        myCache.cacheItem("C object","C");
        PrintCache(cv);
        myCache.cacheItem("D object","D");
        PrintCache(cv);

    }

    private static void PrintCache(CacheView cv){
        int cacheSize = cv.size();
        System.out.println("Cache state:");
        System.out.print("[");
        for (int i = 0; i < cacheSize; i++) {
            System.out.print(cv.getItem(i).getKey() + ",");
        }
        System.out.print("\b]\n");
    }

}
