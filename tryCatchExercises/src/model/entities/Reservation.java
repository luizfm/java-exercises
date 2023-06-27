package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	// Static because we don't want to instanciate every single time this class once we call a Room instancialization;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	public Reservation() {};
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		this.roomNumber = roomNumber;
		updateDates(checkIn, checkOut);
	};
	
	public Integer getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		long diffInMillies = Math.abs(checkIn.getTime() - checkOut.getTime());
		long difference = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		return difference;
	}
	
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		if(!checkIn.after(new Date())) {
			throw new DomainException("Dates must be in the future");
		}
		
		if(checkIn.after(checkOut) || checkIn.equals(checkOut)) {
			throw new DomainException("Check-in must be before Check-out date");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Reservation: Room ");
		sb.append(roomNumber);
		sb.append(", check-in: " + sdf.format(checkIn));
		sb.append(", check-out: " + sdf.format(checkOut));
		sb.append(", " + duration() + " nights");
		return sb.toString();
	}
}
