
package main;

public class Reservation {

    private int reservationID;
    private String customerName;
    private String date;
    private String time;
    private int numberOfGuests;
    private boolean isConfirmed;

    public Reservation(int reservationID, String customerName, String date, String time, int numberOfGuests) {
        this.reservationID = reservationID;
        this.customerName = customerName;
        this.date = date;
        this.time = time;
        this.numberOfGuests = numberOfGuests;
        this.isConfirmed = false;
    }

    public void confirmReservation() {
        isConfirmed = true;
        System.out.println("Reservation confirmed successfully.");
    }

    public void cancelReservation() {
        isConfirmed = false;
        System.out.println("Reservation has been cancelled.");
    }

    public void displayReservationDetails() {
        System.out.println("Reservation ID: " + reservationID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Number of Guests: " + numberOfGuests);
        System.out.println("Status: " + (isConfirmed ? "Confirmed" : "Not Confirmed"));
    }
}