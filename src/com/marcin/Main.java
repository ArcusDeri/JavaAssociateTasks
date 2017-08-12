package com.marcin;

public class Main {

    public static void main(String[] args) {
        Cache kesz = new Cache(3);
        CacheItem lastItem;

        lastItem = kesz.cacheItem("A","A");
        CacheView cv = kesz.getView();
        PrintCache(cv);
        lastItem = kesz.cacheItem("D","D");
        PrintCache(cv);
        lastItem = kesz.cacheItem("B","B");
        PrintCache(cv);
        lastItem = kesz.cacheItem("C","C");
        PrintCache(cv);
        lastItem = kesz.cacheItem("D","D");
        PrintCache(cv);

    }

    private static void PrintCache(CacheView cv){
        System.out.println();
        for (int i = 0; i < cv.size(); i++) {
            System.out.println(cv.getItem(i).getKey() + " " + cv.getItem(i).getValue());
        }
    }

}
