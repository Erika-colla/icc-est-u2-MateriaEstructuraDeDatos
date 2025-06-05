package controllers;
import java.util.EmptyStackException;

import  models.Node;

public class Stack {
    private Node top;
    private int size;

    public Stack(Node top) {
        this.top = top;
        this.size=0;
    }
    public void push (int value){
        Node newNode=new Node (value);
        newNode.setNext(top);
        top =newNode;   
    }
    public int pop(){
        if(top== null){
            throw new EmptyStackException();
        }
        int value=top.getValue();
        top=top.getNext();
        return value;
    }
    public int peek() {
        if (isEmpty()) 
            throw new EmptyStackException();
        return top.getValue();
    }

    public boolean isEmpty(){
        return top==null;
    }
    public void printStack() {
    Node aux = top;
    while (aux != null) {
        System.out.print(aux.getValue() + " | ");
        aux = aux.getNext();
    }
    System.out.println();
}
    public int size () {
        return this.size;
    }
}