package StackOperations;

public class Stack { //implements Operations {
    int stack[]=new int[5];
    int top=-1;
    int i;
    public void push(int element)
    {
        if(top>=4)
        {
            System.out.println("Overflow");
        }
        else
        {
            stack[++top]=element;
            System.out.print("Element pushed: "+stack[top]);
        }
    }
    public void pop()
    {
        if(top<0)
            System.out.println("Underflow");
        else
            System.out.print("Element popped: "+stack[top--]);
    }
    public void display()
    {
        if(top<0)
            System.out.println("Stack is empty");
        else
        {
            for(i=0;i<=top;i++)
                System.out.println(""+stack[i]);
        }
    }
}
