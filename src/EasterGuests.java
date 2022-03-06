import java.util.Scanner;
public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGuests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double countEasternBreads = Math.ceil(countGuests * 1.0 / 3);
        int countEggs = countGuests * 2;

        double sumEasternBreads = countEasternBreads * 4.00;
        double sumEggs = countEggs * 0.45;
        double totalSum = sumEggs + sumEasternBreads;
        if (budget >= totalSum){
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.\n",countEasternBreads,countEggs);
            System.out.printf("He has %.2f lv. left.", budget - totalSum);
        }
        else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", totalSum - budget);
        }
    }
}