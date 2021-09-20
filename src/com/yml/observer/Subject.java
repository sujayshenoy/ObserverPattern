package com.yml.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject<T> {
    List<Observer<T>> observerList = new ArrayList<>();

    public void register(Observer<T> observer) {
        observerList.add(observer);
    }

    public void update(T data) {
        for (Observer<T> observer : observerList) {
            observer.onUpdate(data);
        }
    }
}
