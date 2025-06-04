package models;

public class NodeGeneric<T> {

    private T value; //valor del nodo
    private NodeGeneric<T> next; //Referencia al siguiente nodo

    public NodeGeneric(T value){
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeGeneric<T> getNext() {
        return next;
    }

    public void setNext(NodeGeneric<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodeGeneric [value=" + value + "]";
    }


}
