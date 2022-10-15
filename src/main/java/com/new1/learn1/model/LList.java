package com.new1.learn1.model;

public class LList implements ListADT{

    Element head;

    @Override
    public Object push(Object data) {
        Element element = new Element();
        element.setData(data);
        element.next = null;
        if(head == null){
            head = element;
        }else{
            Element p = head;
            while(p.next != null){
                p = p.next;
            }
            p.next = element;
        }
        return data;
    }

    @Override
    public Object add(int index, Object data) {
        Element element = new Element();
        element.setData(data);
        if(index > length() - 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        Element p = head;
        for(int i = 0;i < index;i++){
            p = p.next;
        }
        element.next = p.next;
        p.next =element;
        return data;
    }

    @Override
    public Object get(int index) {
        if(index > length() - 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        Element p = head;
        for(int i = 0;i < index;i++){
            p = p.next;
        }
        return p.data;
    }

    @Override
    public Object delete(int index) {
        if(index > length() - 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        Element p = head;
        Element pp = null;
        for(int i = 0;i < index;i++){
            pp = p;
            p = p.next;
        }
        pp.next= p.next;
        return p.data;
    }

    @Override
    public void set(int index, Object data) {
        Element element = new Element();
        element.setData(data);
        if(index > length() - 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        Element p = head;
        Element pp = null;
        for(int i = 0;i < index;i++){
            pp = p;
            p = p.next;
        }
        element.next = p.next;
        pp.next = element;
    }

    @Override
    public int length() {
        int size = 0;
        if(head == null){
            return 0;
        }
        Element p =head;
        while(p.next != null){
            p = p.next;
            size++;
        }
        return size + 1;
    }
}
