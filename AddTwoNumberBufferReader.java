
 import java.io.OutputStream;
 import java.io.IOException;
 import java.io.InputStream;
 import java.io.PrintWriter;
 import java.util.StringTokenizer;
 import java.io.IOException;
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.InputStream;
 
 
public class AddTwoNumberBufferReader {
  
   
    // Remember that the class name should be "Main" and should be "public".
   
        public static void main(String[] args)throws java.lang.Exception {
            try{
                BufferedReader Br =new BufferedReader(new InputStreamReader(System.in));
                int T=Integer.parseInt(Br.readLine());
                for (int i=0;i<T;i++) {
                int A=Integer.parseInt(Br.readLine());
                int B=Integer.parseInt(Br.readLine());
                System.out.println(A+B);
                }
            }catch(Exception e){return;}
        }
    }
   

