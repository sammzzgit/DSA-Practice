class Main {
    static char[] st = new char[10];
    static int top = -1;
    
    static void push(char data){
        if(top >= st.length - 1){
            System.out.print("Stack overflow");
            return;
        }
        top = top + 1;
        st[top] = data;
    }
    
    static char pop(){
        if(top == -1){
            System.out.print("Stack UnderFLow");
            return '\0';
        } else{
        char temp = st[top];
        top = top - 1;
        return temp;
        }
    }
    
    static char top(){
        return st[top];
    }
    
    static int size(){
        return top + 1;
    }
    
    public static void main(String[] args) {
      push('H');
      push('e');
      push('l');
      push('l');
      push('o');
      int s = size();
      for(int i = 0; i < s; i++){
          System.out.print(pop());
      }
    }
}
