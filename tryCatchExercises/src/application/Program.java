package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			
			System.out.print("Check-in date (DD/MM/YYYY): ");
			String checkIn = sc.next();
			Date formattedCheckIn = sdf.parse(checkIn);
			
			System.out.print("Check-out date (DD/MM/YYYY): ");
			String checkOut = sc.next();
			Date formattedCheckOut = sdf.parse(checkOut);
			Reservation room = new Reservation(roomNumber, formattedCheckIn, formattedCheckOut);
			System.out.println(room.toString());
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (DD/MM/YYYY): ");
			String updatedCheckIn = sc.next();
			Date formattedUpdatedCheckIn = sdf.parse(updatedCheckIn);
			
			System.out.print("Check-out date (DD/MM/YYYY): ");
			String updatedCheckOut = sc.next();
			Date formattedUpdatedCheckOut = sdf.parse(updatedCheckOut);
			
			room.updateDates(formattedUpdatedCheckIn, formattedUpdatedCheckOut);
			System.out.println(room.toString());
			
			
			sc.close();
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch(ParseException e) {
			System.out.println("Invalid date");
		}
	}

}
