package com.new1.learn1.model;

public interface ListADT {
    Object push(Object data);
    Object add(int index,Object data);
    Object get(int index);
    Object delete(int index);
    void set(int index,Object data);
    int length();
}
