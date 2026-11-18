
package Facade;

public class Main {

    public static void main(String[] args) {

        FlightBookingFacade bookingFacade = new FlightBookingFacade();

        // TEST 1: Successful booking
        System.out.println("=== TEST 1: Successful Booking ===");

        String ticket1 = bookingFacade.bookFlight(
                "Amina Suleimenova",
                "KC101",
                "14A",
                320.00,
                2,
                23.0,
                "EUR",
                "4532015112830366"
        );

        System.out.println("Result 1: " + ticket1 + "\n");


        // TEST 2: Blocked seat
        System.out.println("=== TEST 2: Blocked Seat ===");

        String ticket2 = bookingFacade.bookFlight(
                "Daniyar Kassymov",
                "KC101",
                "13C",
                320.00,
                1,
                15.0,
                "USD",
                "4532015112830366"
        );

        System.out.println("Result 2: " + ticket2 + "\n");


        // TEST 3: Payment failure and rollback
        System.out.println("=== TEST 3: Payment Failure ===");

        String ticket3 = bookingFacade.bookFlight(
                "Timur Bekov",
                "KC101",
                "07D",
                320.00,
                1,
                18.0,
                "KZT",
                "9999"
        );

        System.out.println("Result 3: " + ticket3 + "\n");


        // TEST 4: SILVER loyalty passenger
        System.out.println("=== TEST 4: SILVER Loyalty ===");

        String ticket4 = bookingFacade.bookFlight(
                "Ali Nurzhan",
                "KC205",
                "15A",
                400.00,
                3,
                30.0,
                "USD",
                "4532015112830366",
                "SILVER"
        );

        System.out.println("Result 4: " + ticket4 + "\n");
    }
}
