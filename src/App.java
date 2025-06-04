import controllers.Stack ;
import models.Node;

public class App {
    Stack stack = new Stack();
    stack.push(10);
    stack.push(-1);
    stack.push(0);
    stack.push(5);
    stack.printStack();
    stack.pop();
    stack.peek();
    stack.printStack();

}
