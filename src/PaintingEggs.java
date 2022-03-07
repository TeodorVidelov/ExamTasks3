import java.util.Scanner;
public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String eggsSize = scanner.nextLine();
        String colourOfEggs = scanner.nextLine();
        int countBatch = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (eggsSize){
            case "Large":
                if ("Red".equals(colourOfEggs)){
                    price = 16;
                }
                else if ("Green".equals(colourOfEggs)){
                    price = 12;
                }
                else if ("Yellow".equals(colourOfEggs)){
                    price = 9;
                }
                break;
            case "Medium":
                if ("Red".equals(colourOfEggs)){
                    price = 13;
                }
                else if ("Green".equals(colourOfEggs)){
                    price = 9;
                }
                else if ("Yellow".equals(colourOfEggs)){
                    price = 7;
                }
                break;
            case "Small":
                if ("Red".equals(colourOfEggs)){
                    price = 9;
                }
                else if ("Green".equals(colourOfEggs)){
                    price = 8;
                }
                else if ("Yellow".equals(colourOfEggs)){
                    price = 5;
                }
                break;
        }
        double sum = price * countBatch;
        double manufacturingCosts = sum * 0.35;
        double totalSum = sum - manufacturingCosts;
        System.out.printf("%.2f leva.",totalSum);
    }
}