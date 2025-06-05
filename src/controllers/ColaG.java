package controllers;

import java.util.EmptyStackException;
import models.NodeGeneric;
import models.Persona;

public class ColaG<T> {
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;
    private int size;

    public ColaG() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        return size;
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
        size--;

        if (primero == null) {
            ultimo = null;
        }

        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return primero.getValue();
    }

    public Persona findByName(String name){
        if (isEmpty()) {
            System.out.println("Nombre no encontrado:" +name+ " ");
            return null; 
        }
        NodeGeneric<T> aux=primero;
        while (aux != null){
            Persona persona= (Persona) aux.getValue();
            if (persona.getNombre().equals(name)){
                System.out.println("Buscar por Nombre: " + name + "=>" + persona.getNombre() + " (encontrado)");
                return persona;
            }
            aux = aux.getNext(); 
        }
        return null;
    }
    public Persona removeByName(String name) {
        if (isEmpty()) {
            System.out.println("Eliminar nombre:"+name+"=>null (cola vacía)");
            return null;
        }

        NodeGeneric<T> aux = primero;
        NodeGeneric<T> anterior = null;

        while (aux != null) {
            Persona persona = (Persona) aux.getValue();

            if (persona.getNombre().equals(name)) {
                if (anterior == null) {
                    primero = aux.getNext();
                    if (primero == null) {
                        ultimo = null;
                    }
                } else {
                    anterior.setNext(aux.getNext());
                    if (aux == ultimo) {
                        ultimo = anterior;
                    }
                }
                size--;
                System.out.println("Eliminar Nombre:"+name+"=>"+persona.getNombre()+" persona eliminada");
                return persona;
            }
            anterior = aux;
            aux = aux.getNext(); 
        }
        System.out.println("Eliminar Nombre:"+name+"no encontrado");
        return null;
    }


    public void printCola() {
        NodeGeneric<T> actual = primero;
        while (actual != null) {
            System.out.println(actual.getValue());
            actual = actual.getNext();
        }
    }

    @Override
    public String toString() {
        return "ColaG [primero=" + primero + ", ultimo=" + ultimo + "]";
    }
}