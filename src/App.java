import models.Persona; 
import controllers.*;


public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(null);
        stack.push(10);
        stack.push(-1);
        stack.push(0);
        stack.push(5);
        stack.push(8);
        System.out.println("");
        System.out.println("Tam = "+ stack.size());
        stack.printStack();
        stack.pop();
        System.out.println("");
        System.out.println("Tam = "+ stack.size());
        stack.printStack();
        System.out.println("\n");
        stack.peek();
        stack.printStack();
        
        Cola cola=new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);

        System.out.println("tam = "+ cola.size);
        cola.printCola();
        cola.remove();
        System.out.println("tam = "+ cola.size);
        cola.printCola();

        Persona p1=new Persona("Juan");
        Persona p2=new Persona("Maria");
        Persona p3=new Persona("Pablo");
        
        ColaG<Persona> colaPersonas= new ColaG<Persona>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        System.out.println(colaPersonas.size());
        colaPersonas.printCola();

        System.out.println("Contiene a la persona =>"+colaPersonas.remove());
        System.out.println(colaPersonas.size());
        colaPersonas.printCola();

        colaPersonas.findByName("Maria");
        Persona pEliminada=colaPersonas.removeByName("Pablo");

    }
}