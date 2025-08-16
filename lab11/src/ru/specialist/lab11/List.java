package ru.specialist.lab11;

public class List {
    private static class Node {
        int value;
        Node next;
        
        Node(int value) {
            this.value = value;
        }
    }
    
    private Node first;
    private int size;
    
    public List add(int value) {
        Node newNode = new Node(value);
        
        if (first == null) {
            first = newNode;
        } else {
            Node last = first;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        size++;
        return this;
    }
    
    public boolean contains(int value) {
        return indexOf(value) != -1;
    }
    
    public int indexOf(int value) {
        Node current = first;
        int index = 0;
        while (current != null) {
            if (current.value == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                String.format("Index: %d, Size: %d", index, size));
        }
        
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }
}