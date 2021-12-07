public class Stack_1 {


    private int s;

    int capacity = 5;
    int top =0;
    public void size_Arr(int s){
    s = this.s;
    }

    int [] stack_2 = new int  [capacity];



   public int popUp(){

    int data=0;
    if(isStackEmpty()){
        System.out.println("stack is");
    }else{
      
       top--;
       data = stack_2[top];

       stack_2[top]=0;
       shrinkStack();
    }
    return data;
   }


    
    
    private void shrinkStack() {
        int len =size_St();
        if(len<=(capacity/2)/2)
        capacity = capacity/2;
        int[] newStack = new int [capacity];
        System.arraycopy(stack_2, 0, newStack, 0, len);
        stack_2 = newStack;


}




    public void pushAdd(int data){
    
    if(size_St()==capacity)    
    expand_Stack();
    // if(top==20){
        // System.out.println("stack is full");
    // }else {
    stack_2[top] = data;
    top++;
    // }
    }



    private void expand_Stack() {
        int len = size_St();
        int[] newStack = new int [capacity*2];
        System.arraycopy(stack_2, 0, newStack, 0, len);
        stack_2 = newStack;
        capacity *=2;
    }




    public void showOFF(){
        for (int i : stack_2) {
           System.out.print(i+" "); 
        }
    }


    public int peakUP() {
        int data;
        data = stack_2[top-1];
        return data;    
    }


    public  int size_St(){
    return top;
    }


    public boolean isStackEmpty(){
    return top<=0;
    }
}
