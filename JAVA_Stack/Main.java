public class Main {
    public static void main(String[] args) {
        try {
        
            Stack_1 st = new Stack_1();
            System.out.println(   st.isStackEmpty());

            st.size_Arr(20);

            for(int i=0;i<10;i++)
            st.pushAdd(i*10+1);

            st.showOFF();
            System.out.println();

            System.out.println(st.capacity);

            System.out.println(st.peakUP());

            System.out.println(st.isStackEmpty());
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
