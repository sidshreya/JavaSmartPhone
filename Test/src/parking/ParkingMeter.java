package parking;

/**
 * @author Shreyansi Kumar
 * This class works as parking meter
 * To know the number of minutes of parking time that has been purchased
 * 
 */

public class ParkingMeter {

	private int minutesAllowed;

	public ParkingMeter(int minutesAllowed) {
		super();
		this.minutesAllowed = minutesAllowed;
	}

	public int getMinutesAllowed() {
		return minutesAllowed;
	}

	public void setMinutesAllowed(int minutesAllowed) {
		this.minutesAllowed = minutesAllowed;
	}
}
