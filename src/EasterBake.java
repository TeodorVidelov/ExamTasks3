import java.util.Scanner;
public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEasternBreads = Integer.parseInt(scanner.nextLine());

        int sugar = 0;
        int flour = 0;
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;


        for (int i = 0; i < countEasternBreads; i++) {
            int usedSugarGr = Integer.parseInt(scanner.nextLine());
            int usedFlourGr = Integer.parseInt(scanner.nextLine());

            sugar += usedSugarGr;
            flour += usedFlourGr;
            if (usedSugarGr > maxSugar){
                maxSugar = usedSugarGr;
            }
            if (usedFlourGr > maxFlour){
                maxFlour = usedFlourGr;
            }
        }
        System.out.printf("Sugar: %.0f\n",Math.ceil(sugar * 1.0 / 950));
        System.out.printf("Flour: %.0f\n",Math.ceil(flour * 1.0 / 750));
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",maxFlour,maxSugar);
    }
}