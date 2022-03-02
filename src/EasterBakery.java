import java.util.Scanner;
public class EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceKgFlour = Double.parseDouble(scanner.nextLine());
        double kgFlour = Double.parseDouble(scanner.nextLine());
        double kgSugar = Double.parseDouble(scanner.nextLine());
        int countEggsBox = Integer.parseInt(scanner.nextLine());
        int countPacketsMaya = Integer.parseInt(scanner.nextLine());

        double priceKgSugar = priceKgFlour * 0.75;
        double priceEggsBox = priceKgFlour * 1.10;
        double pricePacketMaya = priceKgSugar * 0.20;

        double totalSum = priceKgFlour * kgFlour + priceKgSugar * kgSugar + priceEggsBox *
                            countEggsBox + pricePacketMaya * countPacketsMaya;
        System.out.printf("%.2f",totalSum);
    }
}