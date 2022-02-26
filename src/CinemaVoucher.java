import java.util.Scanner;
public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valueOfVoucher = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int countBoughtTickets = 0;
        int countBoughtOtherThings = 0;

        while (!"End".equals(input)){
            String typeOfPurchase = input;
            double priceOfPurchases = 0;
            int lengthOfPurchase = typeOfPurchase.length();

            if (lengthOfPurchase > 8){
                priceOfPurchases = typeOfPurchase.charAt(0);
                priceOfPurchases += typeOfPurchase.charAt(1);
                if (valueOfVoucher - priceOfPurchases < 0){
                    break;
                }
                else {
                    countBoughtTickets++;
                    valueOfVoucher -= priceOfPurchases;
                }
            }
            else {
                priceOfPurchases = typeOfPurchase.charAt(0);
                if (valueOfVoucher - priceOfPurchases < 0){
                    break;
                }
                else {
                    countBoughtOtherThings++;
                    valueOfVoucher -= priceOfPurchases;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("%d\n%d",countBoughtTickets,countBoughtOtherThings);
    }
}