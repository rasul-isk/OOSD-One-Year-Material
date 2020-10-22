package week2.lab1;

public class HotelDriver {

	public static void main(String[] args) {
		HotelRoom roomA = new HotelRoom();
		
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		
		HotelRoom roomB = new HotelRoom(201, "Double");

	}

}
