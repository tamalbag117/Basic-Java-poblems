import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class TheLeadingGame {
    public static void main(String[] args)throws java.lang.Exception {
     /* try {
          Scanner sc =new Scanner(System.in);
          int T=sc.nextInt();
          ArrayList<Integer>sum=new ArrayList<Integer>(T);
          ArrayList<Integer>s=new ArrayList<Integer>(T);
          for (int i = 0; i < T; i++) {
          int s1=sc.nextInt();
          int s2=sc.nextInt();
          sum.add(i,(s1-s2));
          s.add(i,(int)Math.abs(sum.get(i)));
          }
          //Find largest number;
          int max = s.get(0);
          int index = 0;
          for (int i = 0; i <T; i++) 
          {
            if (max < s.get(i)) 
            {
              max = s.get(i);
              index = i;
            }
          }
          if (sum.get(index)>0) {
              System.out.println("1 "+s.get(index));
          } else {
              System.out.println("2 "+s.get(index));
          }
          sc.close();
      } catch (Exception e) {
          return;
      }*/
      try {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int []sum=new int [N];
        for (int i = 0; i < N; i++) {
         int s1=sc.nextInt();
         int s2=sc.nextInt();
         sum[i]=s1-s2; 
        }
        Arrays.sort(sum);
        if (Math.abs(sum[0])>Math.abs(sum[N-1])) {
         System.out.println("2"+" "+sum[0]); 
        } else {
         System.out.println("1"+" "+sum[N-1]); 
        }
        sc.close();
      } catch (Exception e) {
        return;
      }  
    }
}
