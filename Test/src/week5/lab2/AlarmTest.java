package week5.lab2;

public class AlarmTest {

	public static void main(String[] args) {
		
		AlarmClock myAlarm = new AlarmClock(11,0);
		myAlarm.setAlarmTime(11, 1);
		
		while(myAlar.checkAlarmTime() == false) {
			long wait = System.currentTimeMillis() + 1000;
			while(System.currentTimeMillis() < wait);
			myAlarm.tick();
			System.out.println(myAlarm.showCurrentTime());
		}
		System.out.println("Ring ring");

	}

}
