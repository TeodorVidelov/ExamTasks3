import java.util.Scanner;
public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsOnStockInShop = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int soldEggs = 0;
        while (!"Close".equals(input)){
            String buyOrFill = input;

            if ("Fill".equals(buyOrFill)){
                int fill = Integer.parseInt(scanner.nextLine());
                eggsOnStockInShop += fill;
            }
            if ("Buy".equals(buyOrFill)) {
                int buy = Integer.parseInt(scanner.nextLine());
                if (buy <= eggsOnStockInShop) {
                    eggsOnStockInShop -= buy;
                    soldEggs += buy;
                } else {
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.", eggsOnStockInShop);
                    break;
                }
            }
            input = scanner.nextLine();
        }
        if ("Close".equals(input)){
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.",soldEggs);
        }
    }
}