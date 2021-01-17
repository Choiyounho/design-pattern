package com.soten.designpattern.observer;

import com.soten.designpattern.observer.publisher.Publisher;

public class EventSubscriber implements Observer {

    private String newsString;
    private final Publisher publisher;

    public EventSubscriber(Publisher publisher) {
        this.publisher = publisher;
        publisher.add(this);
    }

    @Override
    public void update(String title, String news) {
        display(title, news);
    }

    public void withdraw() {
        publisher.delete(this);
    }

    public void display(String title, String news) {
        System.out.println("@@@@@@@ 이벤트 구독자");
        newsString = title + "--------" + news;
        System.out.println(newsString);
    }

}
