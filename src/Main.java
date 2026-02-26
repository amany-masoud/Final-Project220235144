package main;

public class Main {

    public static void main(String[] args) {

        Reservation reservation1 = new Reservation(1, "Amani", "2026-01-10", "07:00 PM", 4);

        reservation1.displayReservationDetails();
        System.out.println("---------------------");

        reservation1.confirmReservation();
        reservation1.displayReservationDetails();

        System.out.println("---------------------");

        reservation1.cancelReservation();
        reservation1.displayReservationDetails();
    }
}
