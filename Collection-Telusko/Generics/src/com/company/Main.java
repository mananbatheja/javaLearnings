package com.company;

import java.util.ArrayList;

class Container<T>{
    T value;
    public void show(){
        System.out.println(value.getClass().getName());
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public void demo(ArrayList<? extends T> obj){ //? extends T - means ? can only be a class which extends T

    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Container<Integer> obj = new Container<>();
        obj.value = 9;
        obj.show();
    }
}
