import java.util.Scanner;
public class EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGuests = Integer.parseInt(scanner.nextLine());
        double priceEnvelopeForPerson = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());


        double priceCake = budget * 0.10;

        if (countGuests >= 10 && countGuests <= 15){
            priceEnvelopeForPerson *= 0.85;
        }
        else if (countGuests > 15 && countGuests <= 20){
            priceEnvelopeForPerson *= 0.80;
        }
        else if (countGuests > 20){
            priceEnvelopeForPerson *= 0.75;
        }
        double totalSum = priceEnvelopeForPerson * countGuests + priceCake;
        if (budget >= totalSum){
            System.out.printf("It is party time! %.2f leva left.",budget - totalSum);
        }
        else {
            System.out.printf("No party! %.2f leva needed.",totalSum - budget);
        }
    }
}