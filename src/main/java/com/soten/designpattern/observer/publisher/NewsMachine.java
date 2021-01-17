package com.soten.designpattern.observer.publisher;

import com.soten.designpattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsMachine implements Publisher {

    private final List<Observer> observers;
    private String title;
    private String news;

    public NewsMachine() {
        observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(title, news);
        }
    }

    public void publish(String title, String news) {
        this.title = title;
        this.news = news;
        notifyObserver();
    }

}
