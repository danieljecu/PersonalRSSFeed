package com.personalrssfeed;

public class RssFeed {

    public int id;
    public String rssFeedTitle;
    public String rssFeedAddress;

public RssFeed(String title, String address){
    rssFeedTitle= title;
    rssFeedAddress= address;
}

public RssFeed(int feedId, String title, String address){
    this.id= feedId;
    rssFeedTitle= title;
    rssFeedAddress =address;
}

}
