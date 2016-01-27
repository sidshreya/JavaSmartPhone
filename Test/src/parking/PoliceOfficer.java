package parking;

/**
 * @author Shreyansi Kumar
 * This class should work as a police officer with following duties
 * To know the name and badge number
 * To examine a parked car and parking meter object and determine whether the car's time has expired.
 *  To issue a parking ticket if the car time has expired.
 * 
 */

public class PoliceOfficer {

	private String name;
	private String badgeNumber;

	public PoliceOfficer(String name, String badgeNumber) {
		super();
		this.name = name;
		this.badgeNumber = badgeNumber;
	}

	public ParkingTicket inspect(ParkedCar car, ParkingMeter meter) {

		ParkingTicket ticket = null;

		// Output the total number of minutes parked and  minutes purchased
		
		int extraMinutes = car.getMinutesParked()
				- meter.getMinutesAllowed();

		// if extraMinutes, then ticket
		if (extraMinutes > 0) {
			// Yes, it is parked for extra minutes than purchased.
			ticket = new ParkingTicket(car, this, extraMinutes);
		}

		return ticket;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBadgeNumber() {
		return badgeNumber;
	}

	public void setBadgeNumber(String badgeNumber) {
		this.badgeNumber = badgeNumber;
	}
}
