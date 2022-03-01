import java.util.Scanner;
public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEasternBreads = Integer.parseInt(scanner.nextLine());
        int countEggsBox12InBox = Integer.parseInt(scanner.nextLine());
        int kgCookies = Integer.parseInt(scanner.nextLine());

        double sumEasterBread = 3.20 * countEasternBreads;
        double sumEggsBox = 4.35 * countEggsBox12InBox;
        double sumCookies = 5.40 * kgCookies;
        double sumPaintingEachEgg = countEggsBox12InBox * 12 * 0.15;

        double totalSum = sumEasterBread + sumEggsBox + sumCookies + sumPaintingEachEgg;
        System.out.printf("%.2f",totalSum);
    }
}