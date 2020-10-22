package week2.lab1;

public class HotelRoom {

	//Variables
	private int roomNumber;
	private String roomType;
	
	
	///Constructors
	public HotelRoom() {
		setRoomNumber(0);
		setRoomType("");
	}
				
	public HotelRoom(int roomNumber, String roomType) {
		super();
		setRoomNumber(roomNumber);
		setRoomType(roomType);
	}




	///Getters & Setter

	public int getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	//toString
	
	
	
	
	
}
