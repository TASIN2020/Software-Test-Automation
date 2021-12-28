package model;

public class Timeout {
	
	public int timeout(int time) {
		try {
			Thread.sleep(time);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		return time;
	} 

}
