package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int rentedRoomsQuantity = sc.nextInt();
		Room[] rooms = new Room[10];
				
		// Create rooms on the array list;
		for(int i = 0; i < rooms.length; i++) {
			rooms[i] = new Room(i+1);
		}
		
		for(int i = 0; i < rentedRoomsQuantity; i++) {
			System.out.println();
			System.out.printf("Rent #%d%n", i + 1);
			
			System.out.print("Name: ");
			sc.nextLine();
			String studentName = sc.nextLine();
			
			System.out.print("Email: ");
			String studentEmail = sc.next();
			
			System.out.print("Room: ");
			int studentRoom = sc.nextInt();
			
			Student student = new Student(studentName, studentEmail);
			rooms[studentRoom - 1].rentRoom(student);
		}
		
		System.out.println();
		
		System.out.println("Busy rooms:");
		
		for(int i = 0; i < rooms.length; i++) {
			if(rooms[i].getIsBusy()) {
				System.out.println(rooms[i]);
			}
		}
		
		
		sc.close();
	}

}
