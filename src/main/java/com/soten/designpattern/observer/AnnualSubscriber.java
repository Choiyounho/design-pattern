package com.soten.designpattern.observer;

import com.soten.designpattern.observer.publisher.Publisher;

public class AnnualSubscriber implements Observer {

    private String newsString;
    private final Publisher publisher;

    public AnnualSubscriber(Publisher publisher) {
        this.publisher = publisher;
        publisher.add(this);
    }

    @Override
    public void update(String title, String news) {
        display(title, news);
    }

    private void display(String title, String news) {
        System.out.println("########### 정기 구독자");
        newsString = title + "--------" + news;
        System.out.println(newsString);
    }

}
