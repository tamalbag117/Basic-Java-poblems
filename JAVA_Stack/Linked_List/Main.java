package Linked_List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try  {
        
        Scanner sc = new Scanner(System.in);    
        Single_LinkedList sl = new Single_LinkedList();
        
        for (int index = 0; index < 12; index++) {
        sl.insert(sc.nextInt());    
        }
        sl.showAll();
        System.out.println();
        sl.deleteAtIndex(2);
        System.out.println();
        sl.showAll();
        sl.insert(111);
        sl.insert(222);
        sl.insert(333);
        System.out.println();
        sl.showAll();
        sl.deleteAtIndex(5);
        sl.insertAtAnywhere(5, 10000);
        System.out.println();
        sl.showAll();
        sl.insertAtAnywhere(7, 0001);
        sl.insertAtStart(44444);
        System.out.println();
        sl.showAll();
        sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
