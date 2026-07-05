class Stack {
    public static void main(String[] args) {
        StackDS stack = new StackDS(10);
        stack.push(56);
        stack.push(6);
        stack.push(5);
        stack.display();
        stack.pop();
        stack.display();
        stack.push(51);
        stack.push(50);
        stack.push(15);
        stack.push(25);
        stack.push(95);
        stack.push(75);
        stack.push(65);
        stack.push(15);
        stack.push(25);
        stack.display();
    }
}

class StackDS {
    int stack[], pointer=0;
    
    Stack(int size){
        this.stack = new int[size];
    }
    
    void push(int value) {
        if(pointer==stack.length) {
            System.out.println("Stack is full");
            return;
        }
        stack[pointer++]=value;
    }
    
    void pop() {
        if(pointer==0){
            System.out.println("Empty stack");
            return;
        }
        pointer--;
    }
    
    void display() {
        for(int i=0;i<pointer;i++) {
            System.out.print(stack[i]+",");
        }
        System.out.println();
    }
}
