import java.util.Scanner;
public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countClients = Integer.parseInt(scanner.nextLine());

        double priceEggsBasket = 1.50;
        double priceEasternWreath = 3.80;
        double priceChocolateBunny = 7;
        double totalSum = 0;

        for (int i = 0; i < countClients; i++) {
            String input = scanner.nextLine();
            int countPurchases = 0;
            double sum = 0;
            while (!"Finish".equals(input)){
                String typePurchase = input;


                if ("basket".equals(typePurchase)){
                    sum += priceEggsBasket;
                }
                else if ("wreath".equals(typePurchase)){
                    sum += priceEasternWreath;
                }
                else if ("chocolate bunny".equals(typePurchase)){
                    sum += priceChocolateBunny;
                }
                countPurchases++;
                input = scanner.nextLine();
            }
            if (countPurchases % 2 == 0){
                sum *= 0.80;
            }
            totalSum += sum;
            System.out.printf("You purchased %d items for %.2f leva.\n",countPurchases,sum);
        }
        System.out.printf("Average bill per client is: %.2f leva.",totalSum / countClients);
    }
}