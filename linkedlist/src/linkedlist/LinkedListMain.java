package linkedlist;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        LinkedList llist = new LinkedList(); 
               
        char ch;
        
        do
        {
            System.out.println("Please choose an action\n");
            System.out.println("1. Append an element into the list(at the back)");
            System.out.println("2. Remove the tail element from the list");
            System.out.println("3. Remove all element in the linkedlist that is great than a target value");
                 
            int choice = scan.nextInt();            
            switch (choice)
            {
                                   
            case 1 : 
                System.out.println("Enter the integer item");
                llist.appendItem( scan.nextInt() );                     
                break;                         
            case 2 : 
                System.out.println("Item at the back will be removed from the list.");
                llist.removeItem();
                break;
                
            case 3: System.out.println("Enter the target value");
            		llist.removeTargetGreater(scan.nextInt());
            		break;
             default: 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            
            llist.display();
            System.out.println("\nDo you wish to continue. Type Y for yes or N for no\n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');    
        

	}

}
