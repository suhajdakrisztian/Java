import java.util.ArrayList;

class Stack<Type> {
  private ArrayList<Type> _stackList;
  private int _size;
  private int _capacity;

  public Stack(int iCapacity) {
    _capacity = iCapacity;
    _stackList = new ArrayList<Type>(_capacity);
  }


  public Type top() {
    if(_size == 0) throw new IllegalArgumentException("The stack is empty");
    return _stackList.get(_size-1);
  }

  public void push(Type newElement) {
    if(_size == _capacity) throw new IllegalArgumentException("Stack is full");
    _stackList.add(newElement);
    _size = _stackList.size();
  }

  public void pop() {
    if(_size == 0) throw new IllegalArgumentException("Stack is empty");
    _stackList.remove(--_size);
  }

  public void show() {
    System.out.println(_stackList.toString()); 
  }

  public int Size() {
    return _stackList.size();
  }
}





public class kilencedikhazi {
  public static void main(String[] args) {
    Stack<Integer> myStack = new Stack<Integer>(4);
    myStack.push(5);
    myStack.push(4);
    myStack.push(3);
    myStack.push(31);
    myStack.show();
    System.out.println(myStack.top());
    myStack.pop();
    myStack.push(99);
    myStack.show();
    myStack.pop();
    myStack.pop();
    myStack.pop();
    myStack.pop();
    myStack.show();
  }
}