import java.util.Scanner;
public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String reservationDates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (destination) {
            case "France":
                if ("21-23".equals(reservationDates)) {
                    price = 30;
                } else if ("24-27".equals(reservationDates)) {
                    price = 35;
                } else if ("28-31".equals(reservationDates)) {
                    price = 40;
                }
                break;
            case "Italy":
                if ("21-23".equals(reservationDates)) {
                    price = 28;
                } else if ("24-27".equals(reservationDates)) {
                    price = 32;
                } else if ("28-31".equals(reservationDates)) {
                    price = 39;
                }
                break;
            case "Germany":
                if ("21-23".equals(reservationDates)) {
                    price = 32;
                } else if ("24-27".equals(reservationDates)) {
                    price = 37;
                } else if ("28-31".equals(reservationDates)) {
                    price = 43;
                }
                break;
        }
        double sum = price * nights;
        System.out.printf("Easter trip to %s : %.2f leva.",destination,sum);
    }
}