class Main {
    static int[] st = new int[10];
    static int top = -1;
    
    static void push(int data) {
        if (top >= st.length - 1) {
            System.out.print("Stack Overflow");
            return;
        }
        top = top + 1;
        st[top] = data;
    }
    
    static int pop() {
        if (top == -1) {
            System.out.print("Stack Underflow");
            return -1;
        } else {
            int temp = st[top];
            top = top - 1;
            return temp;
        }
    }
    
    static int top() {
        return st[top];
    }
    
    static int size() {
        return top + 1;
    }
    
    public static void main(String[] args) {
        push(10);
        pop();
        top();
        push(1);
        push(0);
        size();
    }
}
