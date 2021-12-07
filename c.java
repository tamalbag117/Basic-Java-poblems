import java.util.ArrayList;
import java.util.Scanner;

public class c {
    public static void main(String[] args)throws java.lang.Exception {
       // Scanner sc=new Scanner(System.in);
        /*int T=sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A=sc.nextInt();
            int B=sc.nextInt();
            if(A%B!=0){
            System.out.println(A%B);
            }
        }*/
       /* int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int s1=sc.nextInt();
            int s2=sc.nextInt();
            int s3=sc.nextInt(); 
            int count=s1;
            if (s2>=s3) {
              count+=s3;
              count+=(s2-s3)/3;
            } else if (s3>s2) {
              count+=s2;
              count+=(s3-s2)/3;
            }
            System.out.println(count);

        }
        sc.close();*/
        /*try {
		    Scanner sc =new Scanner(System.in);
		    int T=sc.nextInt();
		    for (int i=0;i<T ;i++ ) {
		        int g=0;
		        int l=0;
		        int a=sc.nextInt();
		        int b=sc.nextInt();
		         for (int j=1;j<=a && j<=b ;j++ ) {
		          if (a%j==0&&b%j==0) g=j;   
		         }
		         l=(a*b)/g;
		         System.out.printf("%d %d\n",g,l);
		    }*/
            
		    
	//	} catch(Exception e) {
	   // return;	} 
     /* try {
       Scanner sc =new Scanner(System.in);
       int T=sc.nextInt();
       for (int i = 0; i < T; i++) {
        String a=sc.next();
        String b=sc.next();
        int flag=0;
        int count=0;
        for (int j = 0; j < a.length(); j++) {
            if(a.charAt(j)=='?'||b.charAt(j)=='?')
            count++;
            if(a.charAt(j)!=b.charAt(j))
            flag++;
        }
        System.out.println(flag +" " +(flag+count));
       }
       sc.close();  
      } catch (Exception e) {
        return;
      } */ 
      /*try {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for (int i = 0; i < T; i++) {
         int N=sc.nextInt();
        int c1=N/100;
        int c2=(N%100)/50;
        int c3=((N%100)%50)/10;
        int c4=(((N%100)%50)%10)/5;
        int c5=((((N%100)%50)%10)%5)/2;
        int c6=(((((N%100)%50)%10)%5)%2)/1;
        System.out.println(c1+c2+c3+c4+c5+c6);   
       } 
      } catch (Exception e) {
        return;
      }*/
   /* try {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      double y=sc.nextDouble();
      if(y>x)
      if(x%5==0){
       y=y-(double)x-0.50;
      }
      System.out.println(y);
      sc.close();
    } catch (Exception e) {
      return;
    }*/
   /* try {
      Scanner sc=new Scanner(System.in);
      int T=sc.nextInt();
     ArrayList<Integer>N=new ArrayList<>(T);
     for (int i = 0; i < T; i++) {
      N.add(i, sc.nextInt()); 
     } 
     int c1=0,c2=0;
     for (int i = 0; i <N.size(); i++) {
       if(N.get(i)%2==0)c1++;
       else c2++;
     }
     if(c1>c2)System.out.println("READY FOR BATTLE");
     else System.out.println("NOT READY");
    sc.close();
    } catch (Exception e) {
      return;
    }*/
    /*try {
     Scanner sc =new Scanner (System.in);
     int T=sc.nextInt();
     for (int i = 0; i < T; i++) {
       double a=sc.nextDouble();
       double b=sc.nextDouble();
       double c=sc.nextDouble();
       if(a>50&&b<0.7&&c>5600)System.out.println("10");
       else if(a>50&&b<0.7&&c<=5600)System.out.println("9");
       else if(b<0.7&&c>5600&&a<=50)System.out.println("8");
       else if(a>50&&c>5600&&b>=0.5)System.out.println("7");
       else if(a<=50&&b>=0.7&&c>5600)System.out.println("6");
       else if(a<=50&&b<0.7&&c<=5600)System.out.println("6");
       else if(a>50&&b>=0.7&&c<=5600)System.out.println("6");
       else if(a<=50&&b>=0.7&&c<=5600)System.out.println("5");
     }
     sc.close();
    } catch (Exception e) {
      return;
    }*/
    }
}
