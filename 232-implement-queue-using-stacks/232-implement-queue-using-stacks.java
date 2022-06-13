class MyQueue {
    Stack mainStack;
    Stack tmpStack;
    
    public MyQueue() {
        mainStack = new Stack();
        tmpStack = new Stack();
    }
    
    public void push(int x) {
        while(mainStack.isEmpty()!=true){
            tmpStack.push(mainStack.pop());
        }
        mainStack.push(x);
        while(tmpStack.isEmpty()!=true){
            mainStack.push(tmpStack.pop());
        }
    }
    
    public int pop() {
        return (int) mainStack.pop();
    }
    
    public int peek() {
        return (int) mainStack.peek();
    }
    
    public boolean empty() {
        return mainStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */