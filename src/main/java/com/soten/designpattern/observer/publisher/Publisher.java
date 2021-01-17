package com.soten.designpattern.observer.publisher;

import com.soten.designpattern.observer.Observer;

public interface Publisher {
    void add(Observer observer);
    void delete(Observer observer);
    void notifyObserver();
}
