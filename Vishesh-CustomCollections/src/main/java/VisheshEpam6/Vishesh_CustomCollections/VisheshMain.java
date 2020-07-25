package VisheshEpam6.Vishesh_CustomCollections;

import java.util.InputMismatchException;
import java.io.*;
import java.util.Collection;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class VisheshMain {

	public static void main(String arg[]) {
        VisheshCollection obj = new VisheshCollection();
        PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
        ps.println("1.Add an element to the list ");
        ps.println("2.Remove an  element from the list");
        ps.println("3.Print the List");
        ps.println("4.Fetch ");
        ps.println("5. Exit");
        while (true) {
        	ps.println("Enter your choice (1-5) :");
            Scanner sc = new Scanner(System.in);
            try {
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        ps.println("Enter the element to add : ");
                        String s1 = sc.next();
                        String s2 = sc.nextLine();
                        obj.add(s1 + s2);
                        break;
                    case 2:
                        ps.println("Enter the index to be removed from the list : ");
                        int j=sc.nextInt();
                        obj.remove(j);
                        break;
                    case 3:
                    	ps.println("The elements present in the List are : " + obj);
                        break;
                    case 4:
                    	ps.println("Enter the index to be fetched:");
                    	int i=sc.nextInt();
                    	obj.fetch(i);
                    	break;

                    case 5:
                        sc.close();
                        System.exit(0);
                        break;
                    default:
                    	ps.println("Invalid selection...");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer between 1-4");
             //used to handle when user enters choice as char or other datatype than int
            }
        }
    }
}



