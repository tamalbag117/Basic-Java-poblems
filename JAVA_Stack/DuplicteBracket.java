import java.util.Scanner;
import java.util.Stack;

public class DuplicteBracket {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        Stack <Character> st = new Stack<Character>();  
        for (int index = 0; index < str.length(); index++) {
        char ch = str.charAt(index);
        if(ch == ')') {
        if(st.peek() =='('){
            System.out.println(true);
            return;
        }else{
            while (st.peek()!='(') {
            st.pop();    
            }
            st.pop();
        }
        }else {
            st.push(ch);
        }   
        } 
        
        System.out.println(false);
       
        } catch (Exception e) {
        System.out.println(e);
        }
    }
}
