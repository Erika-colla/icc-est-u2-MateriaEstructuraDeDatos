package controllers;

import java.util.EmptyStackException;
import models.Node;

public class Cola {
    private Node primero;
    private Node ultimo;
    public int size;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0 ;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public int remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int value = primero.getValue();
        primero = primero.getNext();
        if (primero == null) {
            ultimo = null;
        }
        size--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return primero.getValue();
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public void printQueue() {
        Node current = primero;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public int size() {
        int count = 0;
        Node current = primero;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public void printCola() {
        Node current = primero;
        while (current != null) {
            System.out.print(current.getValue());
            current = current.getNext();
            if (current != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println(" -> null");
    }
    
}