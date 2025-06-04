package controllers;

import java.util.EmptyStackException;

import models.Node;

public class Stack {

    private Node top;

    public Stack() {
        this.top = null;
    }

    //Metodo que ingresa un valor int
    public void push(int value){
        Node newNode = new Node (value);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        return value; 
    }

    public boolean isEmpty(){
        return top == null;

    }
    public int peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public void printStack(){
        Node current = top;
        while( current != null){
            System.out.print(current.getValue());
            current = current.getNext();
        }
        System.out.println();
    }

    public int size(){
        Node aux = top;
        int cont = 0;
        while (aux != null){
            System.out.println(aux.getValue()+ " | ");
            aux = aux.getNext();
            cont++;
        }
        return cont;
    }


}
