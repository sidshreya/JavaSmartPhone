/* @author Shreyansi Kumar */

package parking;
/**
 * This class should work as  a parking ticket with following responsibilities:
 * Report the make, model, color and license number of an illegally parked car.
 * Report the fine - which is $25.00 for first hour plus $10.00 for each additional hour
 * Report the name and badge number of the police officer issuing the ticket.
 * 
 */

public class ParkingTicket {

	private ParkedCar car;
	private PoliceOfficer officer;
	private double fine;
	private int minutes;

	public final double BASE_FINE = 25.0;
	public final double PERHOUR_FINE = 10.0;

	public ParkingTicket(ParkedCar car, PoliceOfficer officer, int minutes) {
		super();
		this.car = car;
		this.officer = officer;
		this.minutes = minutes;

		calculateFine();
	}

	private void calculateFine() {

		double hours = minutes / 60.0;
		int hoursInt = (int) hours;

		if ((hours - hoursInt) > 0) {
			hoursInt++;
		}

		// Equate the base fine.
		fine = BASE_FINE;

		// Add per hour fine
		fine += (hoursInt * PERHOUR_FINE);
	}

	public ParkedCar getCar() {
		return car;
	}

	public void setCar(ParkedCar car) {
		this.car = car;
	}

	public PoliceOfficer getOfficer() {
		return officer;
	}

	public void setOfficer(PoliceOfficer officer) {
		this.officer = officer;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	@Override
	public String toString() {
		return "Summary of Parking Ticket [car = " + car		
				+ ", officer = " + officer
				+ ", fine=" + fine + ", extra minutes=" + minutes
				+ ", BASE_FINE=" + BASE_FINE + ", HOURLY_FINE="
				+ PERHOUR_FINE + "]";
	}



public static void main(String[] args) {

	
	
	// A Hyundai car was parked for 200 minutes
	ParkedCar car = new ParkedCar("Hyundai", "2013",
			"BLACK", "BRPX7259", 200);

	// Parking purchased for 120 minutes so extra minutes 80
	ParkingMeter meter = new ParkingMeter(120);

	// Officer Tim Jones was present
	PoliceOfficer officer = new PoliceOfficer(
			"Tim Jones", "CPD160662");
	
    //Ticket issued?
	ParkingTicket ticket = officer.inspect(car, meter);
	
	if (ticket != null) {
		System.out.println(ticket);
	} else {
		System.out.println("Parking time was not exceeded-- no ticket to be issued");
	}
}
}
