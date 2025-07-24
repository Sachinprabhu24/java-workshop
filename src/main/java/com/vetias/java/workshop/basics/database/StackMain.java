package com.vetias.java.workshop.basics.database;

class StackusingArray {
    private int top;
    private final int stack[];

    StackusingArray(int size){
        top=-1;
        stack=new int[size];
    }
    
    void push(int value){
        if(top == stack.length - 1){
            System.out.println("Stack overflow");
        } else {
            stack[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    int pop(){
        if(top < 0){
            System.out.println("Stack underflow");
            return 0; // or throw an exception
        } else {
            return stack[top--];
        }
    }
    void displayAll(){
        for (int i=0;stack[i] != 0 && i <= top; i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println("");
    }
}

public class StackMain {
    public static void main(String[] args) {
        StackusingArray stack = new StackusingArray(5);
        boolean yes =true;
        int choice;
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            do { 
                System.out.println("1. Push\n2. Pop\n3. Display All\n4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter value to push: ");
                        int value = scanner.nextInt();
                        stack.push(value);
                    }
                    case 2 -> {
                        int poppedValue = stack.pop();
                        if (poppedValue != 0) {
                            System.out.println("Popped: " + poppedValue);
                        }
                    }
                    case 3 -> stack.displayAll();
                    case 4 -> yes = false;
                    default -> System.out.println("Invalid choice, please try again.");
                }
            } 
            while (yes==true);
            System.out.println("Exiting the program.");
        }
    }
}