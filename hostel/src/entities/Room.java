package entities;

public class Room {
	private int roomNumber;
	private boolean isBusy;
	private Student student;
	
	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public int getRoomNumber() {
		return this.roomNumber;
	}
	
	public boolean getIsBusy() {
		return this.isBusy;
	}
	
	public Student getStudent() {
		return this.student;
	}
	
	public void rentRoom(Student student) {
		this.student = student;
		this.isBusy = true;
	}
	
	public void clearRoom() {
		this.isBusy = false;
	}
	
	public String toString() {
		return roomNumber + ": " + student.getName() + ", " + student.getEmail();
	}
}
