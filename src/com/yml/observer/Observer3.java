package com.yml.observer;

public class Observer3<T> implements Observer<T> {
    @Override
    public void onUpdate(T data) {
        if(data instanceof Data) {
			System.out.println(((Data)data).getData());
		}
    }
    
}
