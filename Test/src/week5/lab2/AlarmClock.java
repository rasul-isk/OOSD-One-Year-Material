package week5.lab2;

public class AlarmClock {
	
	//variables
	private Time currentTime;
	private Time alarmTime;
	private boolean set = true;
	
	
	//Constructors
	
	public AlarmClock() {
		
		currentTime = new Time(0,0);
		alarmTime = new Time(0,0);
	
	}
	
	
	public AlarmClock(int h, int m) {
		currentTime(h,m);
		alarmTime = new Time(0,0);
		
	}
	
	//Getters & Setters
	public void setAlarmTime(int h,int m) {
		alarmTime.setTime(h,m,0);
	}
	public String showAlarmTime() {
		return (alarmTime.getHour() + ":" + alarmTime.getMinute());
	}
	public boolean alarmStatus() {
		return set;
	}
	
	
	public void setCurrentTime(int h,int m) {
		currentTime.setTime(h,m,0);
	}
	
	public void tick() {
		currentTime.tick();
	}
	
	
	public String showCurrentTim() {
		return (currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
	}
	
	
	public void enableAlarm() {
		set = true;
	}
	
	public void disableAlarm() {
		set = false;
	}
	
	public boolean checkAlarmTime() {
		int alarmHour = alarmTime.getHour();
		int alarmMinute = alarmTime.getMinute();
		
		if(currentTime.getHour() == alarmHour && currentTime.getMinute() == alarmMinute)
	}
	
	
}
