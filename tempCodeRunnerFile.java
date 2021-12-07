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