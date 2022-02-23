import java.util.Scanner;
public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rentOfTheCeremonyHall = Integer.parseInt(scanner.nextLine());

        double priceOfTheOscarStatue = rentOfTheCeremonyHall * 0.70;
        double priceOfTheCatering = priceOfTheOscarStatue * 0.85;
        double priceOfTheSurroundSystem = priceOfTheCatering * 0.50;

        double costOfTheCeremony = rentOfTheCeremonyHall + priceOfTheOscarStatue + priceOfTheCatering + priceOfTheSurroundSystem;
        System.out.printf("%.2f",costOfTheCeremony);
    }
}