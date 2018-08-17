package com.nevmtet.jva030;

public class ArrayList implements List {
    private Object[] array = new Object[5];
    private int size;

    @Override
    public void add(Object value) {
        array[size] = value;
        size++;
    }

    @Override
    public void add(Object value, int index) {
        if (array.length == size){
            Object[] newArray = new Object[size * 2];
            for (index = 0; index < size; index++){
                newArray[index] = array[index];
            }
            array = newArray;
        }
        array[size] = value;
        size++;
    }

    @Override
    public Object remove(int index) {
        Object result = array[index];
        for (index = 0; index < size; index++){
            array[index] = array[index + 1];
        }
        size --;
        return result;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public Object set(Object value, int index) {
        Object result = array[index];
        array[index] = value;
        return result;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object value) {
        return 0;
    }
}
