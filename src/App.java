import controllers.Cola;
import controllers.Stack;
import controllers.StackG;
import controllers.ColaG;

public class App {
    public static void main(String[] args) throws Exception {
        
        Stack stack = new Stack();

        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);

        System.out.println("Tam = " + stack.size());
        stack.printStack();

        stack.pop();

        stack.peek();

        System.out.println("Tam = " + stack.size());
        stack.printStack();

        //Stack genérica
        StackG<Integer> stackGint = new StackG<Integer>();
        stackGint.push(1);
        stackGint.push(4);
        stackGint.printStack();

        StackG<String> stackGStrinG = new StackG<String>();
        stackGStrinG.push("Uno");
        stackGStrinG.push("Cuatro");
        stackGStrinG.printStack();

        // COLAS
        Cola cola = new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);
        System.out.println("Tam = " + cola.size);
        cola.printCola();
        cola.remove();
        System.out.println("Tam =  " + cola.size);
        cola.printCola();
    }
}