package controllers;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import models.NodeGeneric;

public class ColaG<T> {
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;
    private int size;

    public ColaG() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = primero.getValue();
        primero = primero.getNext();
        if (primero == null) {
            ultimo = null;
        }
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return primero.getValue();
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public void printQueue() {
        NodeGeneric<T> current = primero;
        while (current != null) {
            System.out.print(current.getValue());
            current = current.getNext();
            if (current != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println(" -> null");
    }

    public int size() {
        return size;
    }
}
