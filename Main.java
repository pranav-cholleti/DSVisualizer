import dsp.*;
import java.util.*;
public class Main {
    static void stackfun(){
        Stack<Integer> stack = new Stack<>();
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("---------------");
            System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit\nEnter choice: ");
            int n=sc.nextInt();
            int num;
            switch(n) {
                case 1:
                    System.out.println("Enter no. to push: ");
                    num=sc.nextInt();
                    stack.push(num);
                    break;
                case 2:
                    if(stack.isEmpty()){
                        System.out.println("Stack is Empty!!");
                    }else{
                        System.out.println("Popped value from stack is:"+ stack.pop());
                    }
                    break;
                case 3:
                    new dsp.stackp(stack);
                    break;
                case 4:
                    flag=false;
                    break;
                default:
                    break;
            }
        }
    }
    static void queuefun(){
        Queue<Integer> queue=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("---------------");
            System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.Exit\nEnter choice: ");
            int n=sc.nextInt();
            int num;
            switch (n) {
                case 1:
                    System.out.println("Enter no. to Enqueue: ");
                    num=sc.nextInt();
                    queue.add(num);
                    break;
                case 2:
                    if(queue.isEmpty()){
                        System.out.println("Queue is Empty!!");
                    }else{
                        System.out.println("Dequeued value is:"+ queue.remove());
                    }
                    break;
                case 3:
                    new dsp.queuep(queue);
                    break;
                case 4:
                    flag=false;
                    break;
                default:
                    break;
            }
        }
    }
    static void linkedlistfun(){
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("--------------");
            System.out.println("1.Add\n2.Add first\n3.Remove\n4.Remove first\n5.Display\n6.Exit\nEnter choice: ");
            int n=sc.nextInt();
            int num;
            switch (n) {
                case 1:
                    System.out.println("Enter no. to add: ");
                    num=sc.nextInt();
                    ll.add(num);
                    break;
                case 2:
                    System.out.println("Enter no. to add at first: ");
                    num=sc.nextInt();
                    ll.addFirst(num);
                    break;
                case 3:
                    if(ll.isEmpty()){
                        System.out.println("LinkedList is Empty!!");
                    }else{
                        System.out.println("Removed last value is:"+ ll.remove());
                    }
                    break;
                case 4:
                    if(ll.isEmpty()){
                        System.out.println("LinkedList is Empty!!");
                    }else{
                        System.out.println("Removed first value is:"+ ll.removeFirst());
                    }
                    break;
                case 5:
                    new dsp.linkedlistp(ll);
                    break;
                case 6:
                    flag=false;
                    break;
                default:
                    break;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("---------------");
            System.out.println("1.Stack\n2.Queue\n3.Linked list\n4.Exit\nEnter choice: ");
                int n=sc.nextInt();
            switch (n) {
                case 1:
                    stackfun();
                    break;
                case 2:
                    queuefun();
                    break;
                case 3:
                    linkedlistfun();
                    break;
                case 4:
                    System.out.println("Thank you for using the program :)");
                    flag=false;
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
