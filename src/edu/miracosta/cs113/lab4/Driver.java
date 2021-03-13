package edu.miracosta.cs113.lab4;

import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {
		Directory phoneBook = new Directory();
		Scanner input = new Scanner(System.in);
		int choice = 0;
		String name = "", number = "";
		do {
			System.out.println(
			"Welcome to Phone Book!\n"
			+"Please select an option:\n"
			+"1) Add/Change Entry\n"
			+"2) Remove Entry\n"
			+"3) Display Phone Book\n"
			+"4) End Program");
			choice = input.nextInt();
			input.nextLine();
			
			while(choice != 1 && choice != 2 && choice !=3 && choice!= 4) {
				System.out.println("Please enter a choice. (1 to 3)");
				choice = input.nextInt();
				input.nextLine();
			}
			
			if(choice == 1) {
				System.out.println("Please enter the name of the entry you would like to add/change: ");
				name = input.nextLine();
				System.out.println("Please enter the phone number for " + name +". (with XXX-XXX-XXXX format)");
				number = input.nextLine();
				phoneBook.addOrChangeEntry(name,number);
			}
			
			else if(choice == 2) {
				System.out.println("Please enter the name of the entry you would like to remove: ");
				name = input.nextLine();
				phoneBook.removeEntry(name);
			}
			
			else if(choice ==3) {
				System.out.println("\n\n" + phoneBook.toString());
			}
			
		}while(choice != 4);
		input.close();
	}
	
}
